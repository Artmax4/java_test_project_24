package students.student_maksim_turcin.lesson_9_homeworks.level_2.task_8;

class ComputerPlayer extends Player {

    String name;

    public ComputerPlayer(String name) {
        super(name);
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
