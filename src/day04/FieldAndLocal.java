package day04;

public class FieldAndLocal {

    // aaa: 힙(넓은 공간)
    // 필드는 값을 초기화하지 않아도 각 타입의 기본값으로 자동 세팅
    // 기본값 => 정수: 0, 실수: 0.0, 논리: false, 문자(char): '', 나머지: null
    int aaa;

    // ccc: 매개변수(parameter) - 메서드 호출 시 반드시 필요한 인자값
    void foo (int ccc) {
        // bbb: 스텍(좁은 공간)
        int bbb = 20;

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
