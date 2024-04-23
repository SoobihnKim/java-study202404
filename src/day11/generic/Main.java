package day11.generic;

import day08.protec.pac1.A;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple(10));

        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana(15));
        Banana banana = bb.getBanana();

//        Basket basket1 = new Basket();
//        basket1.setFruit(new Apple(7));
//
//        Basket basket2 = new Basket();
//        basket2.setFruit(new Banana(9));
//
//        Object fruit = basket1.getFruit();

        Basket<Apple> appleBasket = new Basket<Apple>();

        appleBasket.setFruit(new Apple(1));
        Apple fruit = appleBasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setFruit(new Banana(3));
        Banana fruit1 = bananaBasket.getFruit();



    }
}
