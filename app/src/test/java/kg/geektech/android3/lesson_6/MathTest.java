package kg.geektech.android3.lesson_6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import kg.geektech.android3.lesson_6.domain.Math;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;

public class MathTest {

    private Math math;

    @Before
    public void setup() {
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void addTest() {
        assertEquals(5, math.add(2, 3));
        System.out.println("TEST ADD");
    }

    @Test
    public void minusTest() {
        assertEquals(-1, math.minus(2, 3));
        System.out.println("TEST MINUS");
    }

    @Test
    public void multiplicationTest() {
        assertEquals(8, math.multiplication(2, 4));
        System.out.println("TEST MULTIPLICATION");
    }

    @Test
    public void divisionTest() {
        assertEquals(5, math.division(10, 2));
        System.out.println("TEST DIVISION");
    }

    @Test
    public void tearsDown() throws Exception{
        math = null;
        System.out.println("AFTER");
    }

    @After
    public void clear() {
        math = null;
        System.out.println("CLEAR");
    }

}
