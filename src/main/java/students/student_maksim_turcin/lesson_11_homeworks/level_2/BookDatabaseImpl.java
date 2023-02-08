package students.student_maksim_turcin.lesson_11_homeworks.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.*; // all

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    Map<Long, Book> books = new HashMap<>();

    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId((long) bookList.size());
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookId.equals(bookList.get(i).getId())) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        books.remove(book);
        return true;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return createDuplicateList2(author);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return createDuplicateList(title);
    }

    private List<Book> createDuplicateList(String title) {
        List<Book> duplicateBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                duplicateBookList.add(book);
            }
        }
        return checkIfBookExistInList(duplicateBookList);
    }

    private List<Book> createDuplicateList2(String author) {
        List<Book> duplicateBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                duplicateBookList.add(book);
            }
        }
        return checkIfBookExistInList(duplicateBookList);
    }

    private List<Book> checkIfBookExistInList(List<Book> list) {
        if (list.isEmpty()) {
            System.out.println("Not get By *** Test in LIST");
        } else {
            System.out.println("Book get By *** Test in list");
        }
        return list;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book -> book.getTitle().equals(title));
    }
}