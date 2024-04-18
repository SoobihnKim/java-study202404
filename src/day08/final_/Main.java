package day08.final_;

public class Main {

    public static void main(String[] args) {

        Student s = new Student("991212-1234567");
        Student s2 = new Student("991111-1234567");
        s.name = "홍길동";
//        s.nation = "대한민국";
        s.name = "피터 홍";
//        s.nation = "캐나다";
//        s.ssn = "dfd"; final 이므로 불가능

//        s.ssn = "cc";
//        s2.ssn = "dff";

    }
}
