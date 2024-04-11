package day04;

public class DogMain {

    public static void main(String[] args) {


        Dog choco = new Dog("초코"); // choco 지역변수
        Dog poppy = new Dog("뽀삐");

        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);

        choco.petInfo();
        System.out.println("===============================");
        poppy.inject();
        poppy.petInfo();

    }
}
