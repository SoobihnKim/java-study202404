package day03;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int korScore = 77;
        int engScore = 100;
        int mathScore = 99;

        int[] scoresKim = {korScore, engScore, mathScore};
        int[] scoresPark = {100, 22, 56};
        int[] scoresHong = {40, 90, 80};

        // 2차원 배열: 배열 안의 요소가 또 다시 배열인 형태
        int[][] classScores = {scoresKim, scoresPark, scoresHong};

        /*
        {
          {77, 100, 99},
          {100, 22, 56},
          {40, 90, 80}
        }
         */

        System.out.println(classScores.length); // 3
        System.out.println(classScores[0] == scoresKim); // true
        System.out.println(Arrays.toString(classScores[1])); // [100, 22, 56]
        System.out.println(classScores[2][1]); // 90

        System.out.println(Arrays.toString(classScores));
        System.out.println(Arrays.deepToString(classScores));
        //[[77, 100, 99], [100, 22, 56], [40, 90, 80]]

    }
}
