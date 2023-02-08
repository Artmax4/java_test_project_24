package students.student_maksim_turcin.lesson_11_homeworks.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static  void  main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);
    }
}
//нужно оборачивать в обвёртку. Если использовать примитивы то будет выкидывать ошибку
//Integer j = 1;           autoboxing
//int i = new Integer(1);  unboxing