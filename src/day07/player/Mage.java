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

    // 썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다.
    // 1. 자기 자신이 대상이 되면 자기 자신은 피해를 입지 않는다.
    // 2. 타겟이 된 대상은 10 ~ 15의 랜덤 피해를 입고 실제로 체력이 감소한다.
    public void thunderbolt(Player... targets) {
        System.out.printf("%s님 썬더볼트 시전!!\n", this.nickname);
        System.out.println("==========================");
        for (Player p : targets) {
            // 맞은 사람 나인가
            if(p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);
            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.nickname, damage, p.hp);

        }

    }

}
