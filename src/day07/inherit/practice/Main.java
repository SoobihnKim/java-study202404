package day07.inherit.practice;

public class Main {

    public static void main(String[] args) {

        Television tv = new Television("Samsung TV", 2000000, "Samsung", 55);
        Smartphone phone = new Smartphone("iPhone 13", 890000, "Apple", 256);

        System.out.println("\nTV Info:");
        tv.displayInfo();

        System.out.println("\n==================================");

        System.out.println("\nSmartphone Info:");
        phone.displayInfo();


        /*
        TV Info:
        Samsung TV, Price: 2000000, 제조사: Samsung
        Screen Size: 55 inches

        Smartphone Info:
        iPhone 13, 가격: 890000, 제조사: Apple
        저장 용량: 256 GB
         */
    }
}

