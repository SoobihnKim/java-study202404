package day11.api.lang;

public class Wrapper {

    // 기본값 차이가 있음
    private int number1; // 기본값: 0
    private Integer number2; // 기본값: null

    Wrapper() {
        this.number2 = 0;
    }


    public static void main(String[] args) {

        // primitive type 기본 타입
        // byte, short, int, long, boolean, float, double, char

        // Wrapper type 기본 타입을 객체로 포장함
        // Byte, Short, Integer, Long, Boolean, Float, Double, Character

        Integer a = 10; // 오토 박싱 int
        Double b = 3.3;

    }
}
