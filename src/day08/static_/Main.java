package day08.static_;

import day07.modi.pac2.C;
import util.SimpleInput;

import static day08.static_.Count.m1;
import static java.lang.Math.*;
import static java.lang.System.*;
import static util.SimpleInput.input;

public class Main {

    public static void main(String[] args) {

        // static 데이터는 객체 생성 없이 접근 가능
        Count.x = 20;

        m1();

//        Math.random();


        Count c1 = new Count();
        Count c2 = new Count();
        c1.m2();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

        Count.x = 99;
        Count.x = 50;

        out.println("c1.x = " + Count.x);
        out.println("c2.x = " + Count.x);
        out.println("=========================");
        out.println("c1.y = " + c1.y); // 10
        out.println("c2.y = " + c2.y);


        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        Calculator.calcArea(5);

        redCal.paint("빨강");
        blueCal.paint("파랑");

//        String name = input("이름: ");

        double random = random();

        out.println();
        out.println("=========================");

        out.println("국가: " + Person.nation);

        Person gap = new Person("갑돌이", 20);
        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);
    }
}
