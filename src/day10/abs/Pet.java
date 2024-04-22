package day10.abs;

// 일반적 기능 다 함
public abstract class Pet {

    String name;
    int age;
    String kind;

    public Pet() {
    }

    // 산책기능은 필요한 객체가 필요에 따라 오버라이딩 하는 것
    // 모두에게 강요할 필요가 없다면 굳이 추상화하지 않아도 됨
    public void walk() {
        System.out.println("산책은 무조건 공원에서만 하세요.");
    }

    // 밥, 잠 기능은 필수기능이니까 없으면 객체가 불안정해짐
    // 강요할 필요가 있으므로 추상화
    public abstract void eat();

    // 추상메서드는 본문이 없는 껍데기 역할
    // (자식들에게 기능 이름을 통일시키기 위한 장치)로만 사용
    // 추상 메서드는 추상클래스 안에서만 선언 가능
    // 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 선언 가능
    public abstract void sleep();

}
