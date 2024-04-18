package day08.static_.quiz2;

public class Product {
    /*
    - 메소드:
        - 생성자: `productName`과 `price`를 매개변수로 받아 초기화합니다.
        - `sellProduct()`: 제품을 판매하고 `Store`의 총 판매액을 업데이트합니다.
     */
    private String productName;  // 제품명
    private int price;           // 가격

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void sellProduct(){
        Store.addSale(this.price);
    }
}
