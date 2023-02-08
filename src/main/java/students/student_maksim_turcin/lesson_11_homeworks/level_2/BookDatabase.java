package students.student_maksim_turcin.lesson_11_homeworks.level_2;

import java.util.List; // представляет упорядоченную последовательность объектов
import java.util.Optional; //это класс оболочка, которая внутри себя содержит некоторое значение которое может быть
// NULL и если  это значение является NULL'ом, может предпринять какие-то действия, например бросить исключение или
// подставить значение по-умолчанию.

public interface BookDatabase  {

    Long save(Book book);

    boolean delete(Long bookId); //метод предназначен для удаления книги с указанным id

    boolean delete(Book book); //метод предназначен для удаления книги указанной в качестве параметра метода

    Optional<Book> findById(Long bookId); //метод предназначен для поиска книги с указанным id в качестве параметра
    // метода в базе данных

    List<Book> findByAuthor(String author); //метод предназначен для поиска книг указанного автора в базе данных

    List<Book> findByTitle(String title); //метод предназначен для поиска всех книг с указанным названием в базе данных

    int countAllBooks(); //метод предназначен для подсчёта количества книг в библиотеке

    void deleteByAuthor(String author); //метод предназначен для удаления всех книг указанного автора из библиотеки

    void deleteByTitle(String title); //метод предназначен для удаления всех книг c указанным названием из библиотеки
}


