package students.student_maksim_turcin.lesson_14_homeworks.level_2;

import students.student_maksim_turcin.lesson_14_homeworks.level_1.Apple;

public class LightWeightApplePredicate implements ApplePredicate {  //Task_8

    @Override
    public boolean test(Apple apple) { //Task_9
        return apple.getWeight() < 150;
    }
}


