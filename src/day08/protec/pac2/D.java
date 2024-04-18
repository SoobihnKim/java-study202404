package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {

    public D() {
        super(5);

        super.f1 = 100;
//        super.f2 = 200;

        m1();
//        m2();
    }

    void test() {
        A a = new A(); // public 생성자

//        f1 = 10; f2 = 30;
//        m1(); m2();
    }

}
