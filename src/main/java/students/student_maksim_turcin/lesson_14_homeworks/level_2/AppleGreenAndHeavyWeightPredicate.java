package students.student_maksim_turcin.lesson_14_homeworks.level_2;

import students.student_maksim_turcin.lesson_14_homeworks.level_1.Apple;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate { //Task_12
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
//Параметризация поведения великолепна, потому что она позволяет
//вам отделить логику итерации (цикл for) коллекции для фильтрации и поведение,
//применяемое к каждому элементу этой коллекции. Как следствие,
//вы можете повторно использовать один и тот же метод (findApples())
//и подавая в качестве параметра разные реализации интерфейса