//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
// 이름 무조건 main main만 치면 나옴
    public static void main(String[] args) {
        System.out.println(10+5); // sout
        System.out.println("안녕"); // 무조건 쌍따옴표

        int month = 5;
        int day = 5;
        String anni = "어린이날";

        System.out.println(month + "월" + day+ "일은" + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다. \n", month, day, anni); //printf 줄바꿈 안해줌
        System.out.printf("%d월 %d일은 %s입니다.", month, day, anni); //ctrl + d
        System.out.printf("%d월 %d일은 %s입니다.", month, day, anni); //ctrl + x 잘라내기

        int x = 10, y = 20;

        System.out.println(x > 10 && (y / 0 == 10)); //false
        System.out.println(x > 10 || y < 30); //true
    }
}