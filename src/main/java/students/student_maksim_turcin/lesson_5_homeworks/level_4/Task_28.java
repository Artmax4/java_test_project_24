package students.student_maksim_turcin.lesson_5_homeworks.level_4;

import com.sun.jdi.IntegerValue;

import java.util.Random;

public class Task_28 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayY = new int[4];

        for (int i = 0; i < arrayY.length; i++) {
            arrayY[i] = random.nextInt(100);
            System.out.println("[" + i + "]" + arrayY[i]);
        }

        int minNumber = arrayY[0];

        for (int i : arrayY) {
            minNumber = Math.min(minNumber, i);
        }
        System.out.println("Min number is: " + minNumber);
    }
}

//Каким то чудом спустя часов 6 ковыряний. Вроде получилось.

