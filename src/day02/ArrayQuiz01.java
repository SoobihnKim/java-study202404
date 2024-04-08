package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        String[] foodList = {};

        while (true) {
            System.out.print(">> ");
            String newFood = scan.nextLine();

            if (newFood.equals("그만")) break;
            else {
                int[] temp = new int[foodList.length + 1];
                for (int i = 0; i < foodList.length; i++) {
                    temp[i] = Integer.parseInt(foodList[i]);
                }
//                temp[temp.length - 1] = newFood;

                // 4. numbers에 저장된 주소 값을 temp의 주소 값으로 변경
//                foodList = temp;

                temp = null;
            }
            System.out.printf("먹고 싶은 음식리스트: %s", Arrays.toString(foodList));
        }
    }
}
