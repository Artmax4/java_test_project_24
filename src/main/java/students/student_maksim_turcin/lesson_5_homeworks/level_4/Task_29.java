package students.student_maksim_turcin.lesson_5_homeworks.level_4;

import java.util.Random;

public class Task_29 {

    public static void main(String[] args) {
        int[] arrayY = new int[8];

        for (int i = 0; i < arrayY.length; i++) {
            Random random = new Random();
            arrayY[i] = random.nextInt(100);
            System.out.println("[" + i + "]" + arrayY[i]);
        }
        for (int i = 0; i < arrayY.length; i++) {
            arrayY[i] = arrayY[i];
            if (arrayY[i] % 2 == 0) {
                System.out.println("Even number is: " + arrayY[i]);  //  не понимаю как вывести чётные после вывода всех цифр массива  одну строку
            }
        }
    }
}
