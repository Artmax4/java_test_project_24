package students.student_maksim_turcin.lesson_5_homeworks.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {                        //обьявил метод

        Scanner scanner = new Scanner(System.in);                   //добавил  класс сканер
        System.out.println("Give me a array lenght: ");             // запросил длинну массива

        int lengthA = scanner.nextInt();                            // длинна берёться из запрашиваемого сканера
        int[] arrayL = new int[lengthA];                            // длинна из сканера берёться

        Random random = new Random();                               // класс Рандом обьявляю
        for (int i = 0; i < arrayL.length; i++) {                   // i = 0 , i < длинны массива добавленного юзером, i ++ величивает на 1
            arrayL[i] = random.nextInt(400);                  // до 400 максимум

            System.out.println("[" + i + "] " + arrayL[i]);         //вывод массив [длинна запрошенная у юзера] и рандомное число
        }
    }
}
