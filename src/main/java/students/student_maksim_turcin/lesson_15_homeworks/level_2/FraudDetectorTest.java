package students.student_maksim_turcin.lesson_15_homeworks.level_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FraudDetectorTest {
        FraudDetector fraudDetector = new FraudDetector();
        public Trader trader;
        public Trader setUpTrader() {
                Trader trader = new Trader("Pokemon", "Sidney");
                return trader;
        }

        @Test
        public void nameIsBanned() {
                Trader trader = new Trader("Pokemon", "Riga");
                assertTrue(fraudDetector.isFraudAlarm(trader));
        }

        @Test
        public void cityIsBanned() {
                Trader trader = new Trader("Pecemon", "Sidney");
                assertTrue(fraudDetector.isFraudAlarm(trader));
        }

        @Test
        public void nameAndCityIsNotBanned() {
                Trader trader = new Trader("Bruce", "Willis"); //Walter Bruce Willis (born March 19, 1955) is a retired American actor.
                assertEquals(false, fraudDetector.isFraudAlarm(trader));
        }

}

