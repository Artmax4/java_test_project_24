package students.student_maksim_turcin.lesson_8_homeworks._1_2;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest detectPokemon = new FraudDetectorTest();

        detectPokemon.positiveResult();
        detectPokemon.negativeResult();

    }

    public static void positiveResult() {

        Trader trader = new Trader("Pokemon", "Boston");
        System.out.println("Trader name: " + trader.getFullName());
        System.out.println("Trader city: " + trader.getCity());


        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector detector = new FraudDetector();
        boolean result = detector.isFraud(transaction);
        System.out.println("Result is true. ALARMO: " + result);

    }

    public static void negativeResult() {

        Trader trader = new Trader("Ilze", "London");
        System.out.println("Trader name: " + trader.getFullName());
        System.out.println("Trader city: " + trader.getCity());

        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector detector = new FraudDetector();
        boolean result = detector.isFraud(transaction);
        System.out.println("Detector result is: " + result);

    }
}
