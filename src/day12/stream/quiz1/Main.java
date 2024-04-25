package day12.stream.quiz1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> result1 = transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
        result1.forEach(System.out::println);
//        System.out.println("result1 = " + result1);

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        System.out.println("======================================");

        List<String> allCity = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList());
//                .collect(Collectors.toSet());
        System.out.println("allCity = " + allCity);

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        System.out.println("======================================");

        List<Trader> nameCambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(toList());
        nameCambridge.forEach(System.out::println);
//        System.out.println("nameCambridge = " + nameCambridge);

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        System.out.println("======================================");

        List<String> allTraderName = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted() // 정렬은 마지막에 하는게 좋음
                .collect(toList());
        System.out.println("allTraderName = " + allTraderName);

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        System.out.println("======================================");
        boolean flag1 = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println("flag1 = " + flag1);

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        System.out.println("======================================");
        int sum = transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("sum = " + sum);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        System.out.println("======================================");
        List<Integer> maxValue = transactions.stream()
                .map(t -> t.getValue())
                .sorted(Comparator.reverseOrder()) // 정렬기준 없을때 내림차
                .collect(toList());
        System.out.println("maxValue = " + maxValue.get(0));

        int max = transactions.stream()
                .mapToInt(t -> t.getValue())
                .max()
                .getAsInt();
        System.out.println("max = " + max);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        System.out.println("================ 8 =================");

        //        Transaction minTrs = transactions.get(0);
//        for (Transaction trs : transactions) {
//            if (trs.getValue() < minTrs.getValue()) {
//                minTrs = trs;
//            }
//        }
//        System.out.println("minTrs = " + minTrs);

        /*
        자바의 단점: null 체크 문법이 없음

        Transaction min = transactions.get(0);
        if(min != null) {

        } else {
            min = new Transaction();
        }
         */

        Transaction minTransaction = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .orElse(null); // 만약 결과가 null일 경우 어떻게 할건지
        System.out.println("minTransaction = " + minTransaction);

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        System.out.println("======================================");
        transactions.stream()
                .filter(t -> t.getValue() >= 500)
                .collect(toList())
                .forEach(System.out::println);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        System.out.println("================= 10 =====================");

        // 최소거래액 찾기
        int minValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();

        // 평균 구하기
        double average = transactions.stream()
                .filter(trs -> trs.getValue() > minValue)
                .mapToInt(Transaction::getValue)
                .average()
                .getAsDouble();

        System.out.println("average = " + average);

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보들을 연도별로 그룹화하여 출력하시오.
        System.out.println("================= 11 =====================");

              /*
        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .collect(toList());

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .collect(toList());

        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);


        System.out.println("=====================");
        Set<Integer> keySet = groupByYearMap.keySet();
//        System.out.println(keySet);


        for (Integer year : keySet) {
            System.out.println("year = " + year);
            List<Transaction> list = groupByYearMap.get(year);
            for (Transaction trs : list) {
                System.out.println(trs);
            }
        }

         */

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(trs -> trs.getYear()));


        cambridgeTrsMap.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });


        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}

                const data = {
                    2021: [
                        {
                            trader: {
                                city: '',
                                name: ''
                            },
                            year: 2021,
                            value: 300
                        },
                        {}
                    ],
                    2022: []
                }

         */


        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        System.out.println("================= 12 =====================");
        System.out.println(max - minValue);

    }

}
