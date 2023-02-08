package students.student_maksim_turcin.lesson_14_homeworks.level_2;

import students.student_maksim_turcin.lesson_14_homeworks.level_1.Apple;

@FunctionalInterface //У интерфейса ApplePredicate есть только один метод test(). Task_15
public interface ApplePredicate {  //Task_7
    boolean test(Apple apple);
}
