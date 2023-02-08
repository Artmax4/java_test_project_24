package students.student_maksim_turcin.lesson_10_homeworks.level_2;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest detectorTest = new DayOfTheWeekDetectorTest();

        detectorTest.detectorIfTestPositive();
        detectorTest.detectorIfTestNegative();
        detectorTest.detectorSwitchTestPositive();
        detectorTest.detectorSwitchTestNegative();
    }

    void detectorIfTestPositive() {
        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        int number = 7;
        String expectedResult = "Sunday";
        String actualResult = detectorIfVersion.detectDayName(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test Ok 7 = " + actualResult);
        } else {
            System.out.println("Test Fail");
        }
    }

    void detectorIfTestNegative() {
        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        int number = 562;
        String expectedResult = "Monday";
        String actualResult = detectorIfVersion.detectDayName(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test Fail");
        } else {
            System.out.println("Test Negative is Ok. " + "Wrong number, please input day number between 1 and 7");
        }
    }

    void detectorSwitchTestPositive() {
        DayOfTheWeekDetectorSwitch detectorSwitch = new DayOfTheWeekDetectorSwitch();
        int number = 1;
        String expectedResult = "Monday";
        String actualResult = detectorSwitch.detectDayName(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test Ok 1 = " + expectedResult);
        } else {
            System.out.println("Test is wrong! Wrong number, please input day number between 1 and 7");
        }
    }

    void detectorSwitchTestNegative() {
        DayOfTheWeekDetectorSwitch detectorSwitch = new DayOfTheWeekDetectorSwitch();
        int number = -91;
        String expectedResult = "Monday";
        String actualResult = detectorSwitch.detectDayName(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test Fail " + number + " = " + expectedResult);
        } else {
            System.out.println("Test  Negative is OK! Wrong number, please input day number between 1 and 7");
        }
    }
}

