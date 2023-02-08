package students.student_maksim_turcin.lesson_14_homeworks.level_2;

import students.student_maksim_turcin.lesson_14_homeworks.level_1.Apple;

public class AppleGreenColorPredicate implements ApplePredicate { //Task_9
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
