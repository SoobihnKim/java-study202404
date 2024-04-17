package day07.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");
//        myCar.model = "페라리"; private이기 때문에 못바꿈


        myCar.startStop();
//        myCar.start = false; private이기 때문에 못바꿈

        // 속도 0~200km로 제한
        myCar.setSpeed(100);

        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        myCar.setMode('N');
        System.out.println("현재 변속 모드: " + myCar.getMode());


    }
}
