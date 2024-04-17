package day07.player;

public class Hunter extends Player {

    int concentration;

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentration = 10;
    }

    public void showStatus() {
        super.showStatus(); // 부모가 물려준 메서드
        System.out.println("# concentration: " + this.concentration);
    }

    public void multipleArrow() {

    }
}
