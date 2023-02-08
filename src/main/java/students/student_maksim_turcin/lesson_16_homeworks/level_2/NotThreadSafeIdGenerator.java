package students.student_maksim_turcin.lesson_16_homeworks.level_2;

public class NotThreadSafeIdGenerator {

    private int id;

    public int nextId() {
        return id++;
    }
}

