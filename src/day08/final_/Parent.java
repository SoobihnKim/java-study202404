package day08.final_;

class Child extends Parent {
    @Override
    void sing() {
        System.out.println("노래를 빠빠빠");
    }

//    @Override
//    void dance() {
//        System.out.println("댄스를 핑퐁");
//    }
}

public class Parent {

    void sing() {
        System.out.println("노래를 랄랄라");
    }

    // final 붙이면 오버라이딩 불가
    private final static void dance() {
        System.out.println("댄스를 하하호호");
    }

}
