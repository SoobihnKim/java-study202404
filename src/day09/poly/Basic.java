package day09.poly;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    void test() {

        // 다형성: 객체가 여러 타입을 사용할 수 있다.
        // => 부모의 타입 사용 가능
        A x1 = new A();
//        Object x1 = new A();
//        B x1 = new A(); 부모가 자식타입 쓰는건 안됨
//        B x2 = new B();
        A x2 = new B();
//        C x3 = new C();
        A x3 = new C();

//        D x4 = new D();
//        B x4 = new D();
        A x4 = new D();

//        E x5 = new E();
//        A x5 = new E();
        Object x5 = new E();

        int a = 10;
        double b =  (double) a;

        double n = 10; // int 지만 더 큰 범위인 더블도 가능

        C c = new C();
        A d = (A) c;



    }


}
