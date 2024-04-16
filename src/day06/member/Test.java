package day06.member;

public class Test {

    public static void main(String[] args) {

        Member[] arr = new Member[5]; // 멤버 타입 배열(배열 안 요소는 멤버만 가능)

        Member m1 = new Member("abc@def.com", "1234", "김철수", "남성", 30);
//        System.out.println("m1.memberName = " + m1.memberName);
//        System.out.println("m1.gender = " + m1.gender);
//        System.out.println("m1.regDate = " + m1.regDate);

        Member m2 = new Member("xtz@ghi.com", "4567", "김영희", "여성", 31);

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = new Member("ad", "d","d","d",20);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        Member[] members = {m1, m2};
    }
}
