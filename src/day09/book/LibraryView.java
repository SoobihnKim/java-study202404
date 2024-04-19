package day09.book;

import util.SimpleInput;

// 프로그램 입출력 처리
public class LibraryView {

    SimpleInput si;

    LibraryView() {
        this.si = new SimpleInput();
    }

    private static LibraryRepository repository;

    static {
        repository = new LibraryRepository();
    }

    public static void start() {
        inputUser();
        showMainScreen();

    }


    // 회원정보 입력
    static void inputUser() {
        System.out.println("# 회원 정보를 입력해주세요.");
        String name = SimpleInput.input("# 이름: ");
        int age = Integer.parseInt(SimpleInput.input("# 나이: "));
        while (true) {
        String gender = SimpleInput.input("# 성별(M/F): ");
            if(gender.equals("M")) {
                gender = String.valueOf(Gender.MALE);
            } else if (gender.equals("F")) {
                gender = String.valueOf(Gender.FEMALE);
            } else {
                System.out.println("# 성별을 잘못 입력했습니다.");
            }
        }
    }

    // 메뉴 화면 출력
    private static void showMainScreen() {
        System.out.println("\n=============도서 메뉴============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료");
        System.out.println("=============================");

        String menuNumber = SimpleInput.input("- 메뉴 번호: ");
    }

    static void myPage() {

    }

    static void allBook() {


    }




}
