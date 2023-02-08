package students.student_maksim_turcin.lesson_10_homeworks.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorApp {
    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorApp(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");  //запрашиваем число
        //создать инт и положить число пользователя
          int number = scanner.nextInt();
        //добавить проверку if или\и while
        while (number > 7 || number < 0) {
            System.out.println("Wrong number, please input day number between 1 and 7");
            number = scanner.nextInt();
        }
        //создаем выводим на консоль какой это день
        System.out.println(detector.detectDayName(number));


    }


    public static void main(String[] args) {   //psvm
        //создаем два детекторав с имплементацией свич demo1 и иф demo2
        DayOfTheWeekDetectorApp demo1 = new DayOfTheWeekDetectorApp(new DayOfTheWeekDetectorSwitch());
        DayOfTheWeekDetectorApp demo2 = new DayOfTheWeekDetectorApp(new DayOfTheWeekDetectorIfVersion());

        demo1.run(); // метод ран() void run()
        demo2.run();
    }
}
