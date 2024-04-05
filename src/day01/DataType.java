package day01;

public class DataType {
    public static void main(String[] args) {

        // 1byte == 8bit
        // 1bit == 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8+4+2+1 = 15 이진수
        // 11111111 => 128 + 64 + 32 + 16 + 8 + 4 + 2 + 1 = 255
        // 0 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        // 1024byte == 1kb
        // 1024kb == 1mb
       byte a = 127; // 1byte
       short b = 32767; // 2byte 2^14
        
       int c = 2147483647; // 4byte
        
       long d = 2147483647L; // 8byte //숫자공간 int 공간만큼이 한계, 뒤 L(접미사)을 붙이면 가능
        
        float e = 3.143515421213F; // 4byte
        double f = 3.14159845123; // 8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g); // 100.0

        boolean flag1 = false;
        boolean flag2 = 10 > 5;

        //ctrl + alt + v 알아서 맞는 타입으로 담아줌
        int i = 100;
        double v = 5.5;
        boolean b1 = true;
        double random = Math.random();

        int x = 200;
        System.out.println(x + a);
        System.out.println( b * x);


    }
}
