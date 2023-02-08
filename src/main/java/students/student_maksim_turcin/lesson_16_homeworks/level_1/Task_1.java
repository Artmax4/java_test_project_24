package students.student_maksim_turcin.lesson_16_homeworks.level_1;

public class Task_1 extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " Hello world");
    }
}
//Thread — это поток, только на уровне кода. Создать их можно
// сколько угодно, но одновременно будет выполняться столько, сколько поддерживает система.
