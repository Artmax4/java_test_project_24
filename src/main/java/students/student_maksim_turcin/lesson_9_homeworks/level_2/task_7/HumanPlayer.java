package main.java.students.student_maksim_turcin.lesson_9_homeworks.level_2.task_7;

class HumanPlayer extends Player {
    private String name;

    public HumanPlayer(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}