package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        // 자바 8 이전
        Date date = new Date();
        System.out.println("date = " + date.getYear());

        Calendar calendar = Calendar.getInstance();

        // 자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        System.out.println(nowDate.getYear()); // 2024
        System.out.println(nowDate.getMonth()); // APRIL
        System.out.println(nowDate.getMonthValue()); // 4

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);
        System.out.println("nowTime = " + nowTime.getHour());

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        // 특정날짜정보 생성하기
        LocalDate targetDate = LocalDate.of(2022, 4, 15);
        System.out.println("targetDate = " + targetDate);

        // 날짜 연산
        // 도서 대여 시스템에서 빌린 날짜로부터 3일 뒤가 반납일
        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        LocalDate targetDateTime = returnDate.plusYears(2).plusMonths(3).plusDays(5);
        System.out.println("targetDateTime = " + targetDateTime);

        // 사이날짜 구하기
        LocalDate hireDate = LocalDate.of(2019, 7, 22);
        LocalDate retireDate = LocalDate.of(2023, 10, 31);

        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);

        // 날짜 포맷 바꾸기
        System.out.println("nowDateTime = " + nowDateTime);

        DateTimeFormatter pattern
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");

        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = " + dateString);


    }
}
