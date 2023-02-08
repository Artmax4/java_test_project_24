package students.student_maksim_turcin.lesson_15_homeworks.level_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuadraticEqTest {

    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    public void discriminantShouldBeLessThanZero() {
        assertEquals("Equation has no roots", quadraticEq.calc(30, -6, 20));
    }

    @Test
    public void discriminantShouldBeEqualsZero() {
        assertEquals("x = " + 1.0, quadraticEq.calc(1, -2, 1));
    }

    @Test
    public void discriminantShouldBeGreaterZero() {
        assertEquals("x1 = " + -1.0 + ", x2 = " + 5.0, quadraticEq.calc(1, -4, -5));
    }

}