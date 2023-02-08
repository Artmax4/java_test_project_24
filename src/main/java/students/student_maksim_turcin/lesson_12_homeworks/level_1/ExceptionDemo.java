package students.student_maksim_turcin.lesson_12_homeworks.level_1;

public class ExceptionDemo {
    public static void main(String[] args) {
        MyExceptionClass mc2 = new MyExceptionClass();
        String str1 = mc2.getMessage();
        System.out.println("str = " + str1);
    }
}

class MyExceptionClass extends Exception
//в классе Exception являются доступными все методы из класса Throwable.
{

}

