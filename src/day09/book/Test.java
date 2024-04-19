package day09.book;

public class Test {

    public static void main(String[] args) {

        LibraryRepository repository = new LibraryRepository();

        Book[] array = repository.searchBookList("맨");
        for (Book book : array) {

        }
    }
}
