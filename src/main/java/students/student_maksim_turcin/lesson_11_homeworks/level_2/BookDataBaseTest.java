package students.student_maksim_turcin.lesson_11_homeworks.level_2;

import java.util.List;

public class BookDataBaseTest {

    public static void main(String[] args) {

        BookDataBaseTest bookTest = new BookDataBaseTest();
        bookTest.deleteTestId();
        bookTest.deleteTest();
        bookTest.getByAuthorTest();
        bookTest.getByTitleTest();
        bookTest.CountTest();
        bookTest.deleteByAuthorTest();
        bookTest.deleteByTitleTest();

    }

    public void deleteTestId() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        Long idNewBook = bookDatabaseImpl.save(new Book("Mihailov", "Tri porosjonka"));

        if (bookDatabaseImpl.delete(idNewBook)) {
            System.out.println("Delete test id = OK");
            System.out.println("----------------");
        } else {
            System.out.println("Delete test id = FAIL");
        }

    }

    public void deleteTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        Long idNewBook = bookDatabaseImpl.save(new Book("a", "b"));

        if (bookDatabaseImpl.delete(new Book("a", "b"))) {
            System.out.println("Delete test = OK");
            System.out.println("----------------");
        } else {
            System.out.println("Delete test = FAIL");
        }
    }

    public void getByAuthorTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Lecturer", "Abc"));
        bookDatabaseImpl.save(new Book("Lecturer", "Abc2"));
        bookDatabaseImpl.save(new Book("Writer", "Abcdefg"));
        bookDatabaseImpl.save(new Book("Author", "Abc"));

        List<Book> foundBooks = bookDatabaseImpl.findByAuthor("Lecturer");

        if (foundBooks.size() == 2) {
            System.out.println("getByAuthorTest = OK");
            System.out.println("----------------");
        } else {
            System.out.println("getByAuthorTest = FAIL");
        }
    }

    public void getByTitleTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Lecturer", "Abc"));
        bookDatabaseImpl.save(new Book("Teacher", "Abc"));
        bookDatabaseImpl.save(new Book("Writer", "Abcdefg"));
        bookDatabaseImpl.save(new Book("Author", "Abc"));

        List<Book> foundBooks = bookDatabaseImpl.findByTitle("Abc");

        if (foundBooks.size() == 3) {
            System.out.println("getByTitleTest = OK");
            System.out.println("----------------");
        } else {
            System.out.println("getByTitleTest = FAIL");
        }
    }

    public void CountTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Lecturer", "Abc"));
        bookDatabaseImpl.save(new Book("Teacher", "Abc"));
        bookDatabaseImpl.save(new Book("Writer", "Abcdefg"));
        bookDatabaseImpl.save(new Book("Author", "Abc"));
        bookDatabaseImpl.save(new Book("Author", "Abcd"));

        int count = bookDatabaseImpl.countAllBooks();

        if (count == 5) {
            System.out.println("CountTest = OK");
            System.out.println("----------------");
        } else {
            System.out.println("CountTest = FAIL");
        }
    }

    public void deleteByAuthorTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Pepe", "test3"));
        bookDatabaseImpl.save(new Book("Pepe", "test30"));
        bookDatabaseImpl.save(new Book("testAuthor", "test"));
        bookDatabaseImpl.save(new Book("testAuthor", "test2"));
        bookDatabaseImpl.save(new Book("asdasd", "test3"));
        bookDatabaseImpl.save(new Book("testAuthor", "test4"));

        bookDatabaseImpl.deleteByAuthor("Pepe");

        if (bookDatabaseImpl.countAllBooks() == 4) {
            System.out.println("deleteByAuthorTest = OK");
            System.out.println("----------------");
        } else {
            System.out.println("deleteByAuthorTest = FAIL");
        }
    }

    public void deleteByTitleTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("a", "b2"));
        bookDatabaseImpl.save(new Book("a", "b1"));
        bookDatabaseImpl.save(new Book("a", "b2"));
        bookDatabaseImpl.save(new Book("a", "b4"));
        bookDatabaseImpl.save(new Book("testAuthor", "test4"));

        bookDatabaseImpl.deleteByTitle("test4");

        if (bookDatabaseImpl.countAllBooks() == 4) {
            System.out.println("deleteByTitleTest = OK");
            System.out.println("----------------");
        } else {
            System.out.println("deleteByTitleTest = FAIL");
        }
    }
}