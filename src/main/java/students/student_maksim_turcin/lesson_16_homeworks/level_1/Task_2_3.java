package students.student_maksim_turcin.lesson_16_homeworks.level_1;

public class Task_2_3 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            Task_1 thread = new Task_1();
            thread.start();
        }
    }
}
