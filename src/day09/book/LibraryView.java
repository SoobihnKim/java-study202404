package day09.book;

import day05.StringList;
import util.SimpleInput;

import static util.SimpleInput.*;

// 도서관리 프로그램 입출력 처리
public class LibraryView {

    private LibraryRepository repository;

    public LibraryView() {
        this.repository = new LibraryRepository();
    }


    // 회원 정보를 입력받는 기능
    public void makeNewBookUser() {
        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = inputGender();

        // 입력된 데이터를 저장시켜야 함.
        repository.saveBookUser(new BookUser(name, age, gender, 0));
    }


    // 성별을 정확히 입력할때까지 무한히 입력받고
    // 정확히 입력하면 해당 성별 문자를 리턴
    private Gender inputGender() {
        while (true) {
            String gender = input("# 성별(M/F): ").toUpperCase();
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("\n# 성별을 잘못 입력했습니다.");

        }
    }

    // 메뉴를 출력하는 기능
    public void showMainScreen() {
        System.out.println("\n=============도서 메뉴============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료");
        System.out.println("=============================");
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        makeNewBookUser();

        while (true) {
            showMainScreen();
            String menuNum = input("- 메뉴 번호 : ");

            switch (menuNum) {
                case "1":
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "9":
                    System.out.println("# 프로그램을 종료합니다!!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }

    // 전체 도서 정보를 출력
    private void displayAllBooks() {
        System.out.println("\n========== 전체 도서 목록 =============");
        Book[] informationList =  repository.getAllBooksInfo();

        for (Book book : informationList) {
            System.out.println(book.info());
        }


        }
    }



