package students.student_maksim_turcin.lesson_16_homeworks.level_2;

public class ThreadSaveJob extends Thread {
    public void setGenerator(ThreadSafeAtomicIdGenerator generator) {
        this.generator = generator;
    }

    ThreadSafeAtomicIdGenerator generator;

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Safe " + generator.nextId());
        }
    }
}