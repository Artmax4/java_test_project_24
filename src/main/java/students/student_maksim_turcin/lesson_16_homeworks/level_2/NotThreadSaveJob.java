package students.student_maksim_turcin.lesson_16_homeworks.level_2;

public class NotThreadSaveJob extends Thread {

    public void setGenerator1(NotThreadSafeIdGenerator generator) {
        this.generator = generator;
    }

    NotThreadSafeIdGenerator generator;

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("notSafe " + generator.nextId());
        }
    }
}
