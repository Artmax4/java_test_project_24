package students.student_maksim_turcin.lesson_5_homeworks.level_2;

import java.util.Random;

public class Task_12 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        numbers[0] =  random.nextInt();
        numbers[1] =  random.nextInt();
        numbers[2] =  random.nextInt();   // убрал (int)

        System.out.println("Numbers: ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
