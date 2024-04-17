package day07.player;

// 상위 클래스(super class)
// 공통 속성(필드 field)과 기능(메서드 method)을 가진 부모 클래스
public class Player { // extends Object 자동으로 됨

    String nickname;
    int level;
    int hp;

    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n=========Character's Info==========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

}
