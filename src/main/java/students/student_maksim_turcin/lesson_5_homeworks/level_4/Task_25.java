package students.student_maksim_turcin.lesson_5_homeworks.level_4;

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a array lenght: ");


        int length = scanner.nextInt();
        int[] arrayL = new int[length];

        for (int i = 0; i < arrayL.length; i++) {
            System.out.println("Input numbers: ");
            arrayL[i] = scanner.nextInt();
            System.out.println("[" + i + "] " + arrayL[i]);
        }
        for (int i = 0; i < arrayL.length; i++) {
            arrayL[i] = arrayL[i];
            if (arrayL[i] == arrayL[i]) ;
            int everyNum = arrayL[i];
            System.out.println("All numbers: " + everyNum);
        }
    }
}
