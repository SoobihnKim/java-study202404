package day01;

public class RandomExample {
    public static void main(String[] args) {

        // 연산자 우선순위
        // 단항(++, --, !) > 이항(*, / , %, ...) > 삼항(?:) > 대입(=)

        int a = 10;
        int b = 10 * 3 - ++a ; // ++ 먼저 진행함

        /*
        자바에서 난수만들기

      x ~ y 사이의 정수 난수 만드는 공식(자바스크립트)
            (int) (Math.random() * (y - x + 1)) + x
         */

        // 1~10까지의 난수 만들기
        //Math.random() => 0.0 <= ~ < 1.0
        // (int)Math.random() => 0 <= ~ < 1
        int rn = (int)(Math.random() * 10) + 1; // 괄호 꼭 있어야함 (우선순위때문)
        System.out.println("rn = " + rn);

    }
}
