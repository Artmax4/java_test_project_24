package students.student_maksim_turcin.lesson_11_homeworks.level_1;

import java.util.List;
import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(15);
        numbers.add(15);

        System.out.println("Dublicates");
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
    }
}