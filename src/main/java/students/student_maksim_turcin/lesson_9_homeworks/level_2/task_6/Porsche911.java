package students.student_maksim_turcin.lesson_9_homeworks.level_2.task_6;

class Porsche911 extends Car {

    private int topSpeed;    //Code + Generate + Constructor


    public Porsche911(int releaseYear, int topSpeed) {               //конструктор
        super(releaseYear);  // Отцовская переменная. Наследуемая
        this.topSpeed = topSpeed;  // Сыновья функция (this.)
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }
}
