package students.student_maksim_turcin.lesson_8_homeworks._1_2;

public class FraudDetector {

    public static final String POKEMON = "Pokemon";

    boolean isFraud(Transaction transaction) {

        Trader trader = transaction.getTrader();
        String fullName = trader.getFullName();
        return POKEMON.equals(fullName);
    }
}
