package day08.final_;

public class Student {

    String name;
    // 필드에서 final 쓰려면 초기화 같이 해야함
    final String ssn; // 주민번호
    String nation; // 국적

    public Student(final String ssn) {
//        ssn = "dfdsfd"; // 지역변수에 final 붙이면 안에서 조작 불가능


        this.ssn = ssn;
    }

    // setter 만드는게 의미가 없음

}
