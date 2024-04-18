package day08.static_.quiz2;

public class Store {
    /*
    - 메소드:
        - `addSale(int amount)`: 판매액을 총 판매액에 추가하는 static 메소드.
        - `getTotalSales()`: 현재까지의 총 판매액을 반환하는 static 메소드.
     */
    private static int totalSales; // 총 판매액


    public static void addSale(int amount) {
        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }
}
