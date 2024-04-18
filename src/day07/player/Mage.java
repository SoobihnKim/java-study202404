package day07.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickname) {
        super(nickname);
//        this.nickname = nickname;
//        this.level = 1;
//        this.hp = 50;
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus(); // 부모가 물려준 메서드
        System.out.println("# mana: " + this.mana);
    }

    public void thunderbolt(Mage... targets) {

    }

}
