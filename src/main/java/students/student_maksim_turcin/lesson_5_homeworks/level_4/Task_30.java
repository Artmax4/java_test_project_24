package students.student_maksim_turcin.lesson_5_homeworks.level_4;

import java.util.Random;

public class Task_30 {

    public static void main(String[] args) {
        int[] arrayI = new int[4];

        for (int i = 0; i < arrayI.length; i++) {
            Random random = new Random();
            arrayI[i] = random.nextInt(100);
            System.out.println("[" + i + "]" + arrayI[i]);
        }
        for (int i = 0; i < arrayI.length; i++) {
            if (arrayI[i] % 2 != 0) {
                System.out.println("Odd number is: " + arrayI[i]);
            }
        }
    }
}
