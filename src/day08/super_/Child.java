package day08.super_;

public class Child extends Parent{

//    int a;
//    double b;
    boolean c;

    Child() {
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }

    Child(int x) {
        super(); // 쓰지않아도 자동으로 들어감(숨어있음)(괄호 안 비어있는 생성자)
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }

    void childMethod() {
        System.out.println("Child.a = " + this.a);
        System.out.println("Child.b = " + this.b);
        System.out.println("Child.c = " + this.c);
    }
}
// 자식클래스에 없으면 부모한테 찾으러감
// 부모의 객체를 같이 생성해서 연결하는 것이 상속
