package students.student_maksim_turcin.lesson_5_homeworks.level_2;

public class Task_14 {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // случайное число до 1000
        }
                                                      // оставил строку пустой
        System.out.println("Average number: " + (array[0] + array[1] + array[2]) / 3);
    }
}
