package day05.player;

public class Main {

    public static void main(String[] args) {

        Player parking = new Player("주차왕파킹");
        Player insultKing = new Player("욕설왕뻐킹");

        System.out.println("parking = " + parking);
        System.out.println("insultKing = " + insultKing);

        insultKing.attack(parking);
        parking.attack(insultKing);
        parking.attack(insultKing);
        parking.attack(insultKing);

        // 객체 하나에 생성자 하나 부를 수 있음
        Player p1 = new Player();
        Player p4 = new Player("하하호호");
        Player p2 = new Player("", 0);
        Player p3 = new Player("", 0, 0);
    }
}
