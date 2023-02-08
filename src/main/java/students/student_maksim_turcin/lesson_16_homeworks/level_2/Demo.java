package students.student_maksim_turcin.lesson_16_homeworks.level_2;

public class Demo {

    public static void main(String[] args) {

        ThreadSafeAtomicIdGenerator threadSafeAtomicIdGenerator = new ThreadSafeAtomicIdGenerator();

        for (int i = 0; i < 2; i++) {

            ThreadSaveJob thread = new ThreadSaveJob();
            thread.setGenerator(threadSafeAtomicIdGenerator);
            thread.start();
        }
        NotThreadSafeIdGenerator notThreadSafeIdGenerator = new NotThreadSafeIdGenerator();
        for (int i = 0; i < 6; i++) {

            NotThreadSaveJob thread = new NotThreadSaveJob();
            thread.setGenerator1(notThreadSafeIdGenerator);
            thread.start();
        }
    }
}
