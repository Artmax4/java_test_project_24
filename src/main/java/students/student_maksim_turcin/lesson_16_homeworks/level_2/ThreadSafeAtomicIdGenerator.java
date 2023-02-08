package students.student_maksim_turcin.lesson_16_homeworks.level_2;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeAtomicIdGenerator {

    private AtomicInteger id = new AtomicInteger();

    public int nextId() {
        return id.incrementAndGet();
    }
}
