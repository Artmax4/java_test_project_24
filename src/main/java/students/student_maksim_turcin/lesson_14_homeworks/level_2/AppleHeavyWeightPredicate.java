package students.student_maksim_turcin.lesson_14_homeworks.level_2;

import students.student_maksim_turcin.lesson_14_homeworks.level_1.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}

