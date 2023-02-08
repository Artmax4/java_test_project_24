package students.student_maksim_turcin.lesson_5_homeworks.level_4;

import java.util.Random;

public class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayN = new int[random.nextInt()];

        int maxNumber = arrayN[0];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = random.nextInt();
            System.out.println("[" + i + "]" + arrayN[i]);
            if (arrayN[i] > maxNumber) {
                maxNumber = arrayN[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);
    }
}
