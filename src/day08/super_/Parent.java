package day08.super_;

public class Parent extends Object {

    // 필드: 객체의 속성 - 성질, 데이터, 명사
    int a;
    double b;

    // 생성자: 객체가 생성될 때 초기화(초기세팅)
    // 클래스 이름과 동일, 리턴 타입이 없음
    Parent() {
        super();
        System.out.println("Parent 클래스 생성자 호출!");
        this.a = 15;
        this.b = 20.5;
    }

    // 메서드: 객체의 기능 - 행위, 행동, 동사
    // 리턴타입 앞에 반드시 붙어야함
    void superMethod() {
        System.out.println("Parent.a = " + this.a);
        System.out.println("Parent.b = " + this.b);
    }
}
