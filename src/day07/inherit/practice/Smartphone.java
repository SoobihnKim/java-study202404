package day07.inherit.practice;

public class Smartphone extends ElectronicProduct{

    /*
     - `ElectronicProduct`의 서브 클래스입니다.
    - 추가 속성:
        - `storageCapacity` (저장 용량, 정수형)
    - 메소드:
        - 생성자: 기본 클래스의 속성과 `storageCapacity`를 초기화합니다.
        - `displayInfo()` 메소드를 오버라이드하여 저장 용량 정보도 포함하여 출력합니다.
     */

    int storageCapacity;

    public Smartphone() {
    }

    public Smartphone(String productName, int price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\n저장 용량: %d GB", this.storageCapacity);
    }
}
