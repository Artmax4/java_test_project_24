package students.student_maksim_turcin.lesson_15_homeworks.level_2;

public class FraudDetector {
    boolean isFraudAlarm(Trader trader) {
        return findNameBan(trader) || (findCityBan(trader));
    }

        boolean findNameBan(Trader trader) {
        String fullName = trader.getFullName();
        if (fullName.equals("Pokemon")) {
        }
        return true;
    }

    boolean findCityBan(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}
