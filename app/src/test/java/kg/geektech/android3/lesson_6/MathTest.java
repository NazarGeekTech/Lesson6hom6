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
    public static final String DIV_METHOD = "The DIV method should divide 2 numbers";
    public static final String SUB_METHOD = "The SUB method should do simple subtraction (from a - b)";
    public static final String MUL_METHOD = "The MUL method should multiply 2 numbers";
    public static final String POW_METHOD = "The POWER method should do simple exponent";
    public static final String THE_ROOT = "The ROOT the method should do simple square root";
    public static final String MESSAGE_ADD = "The ADD method should add 2 numbers";
    public static final String REVERS_METHOD = "The REVERSE method simply reverses any given sentence";
    private Math math;

    @Before
    public void setup()  {
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void addTest() {
        assertEquals(4, math.add(2, 2));
        assertEquals(5, math.add(15, -10));
        assertEquals(-4, math.add(-15, 11));
        assertEquals(-0, math.add(-15, 15));
        assertEquals(-30, math.add(-15, -15));
        System.out.println("TEST ADD");

    }

    @Test
    public void minusTest() {
        assertEquals(SUB_METHOD,4, math.minus(8, 4));
        assertEquals(SUB_METHOD,-20, math.minus(-10, 10));
        assertEquals(SUB_METHOD,0, math.minus(-10, -10));
        assertEquals(SUB_METHOD,20, math.minus(10, -10));
        assertEquals(SUB_METHOD,0, math.minus(0, 0));
        assertEquals(-1, math.minus(2, 3));
        System.out.println("TEST MINUS");
    }

    @Test
    public void multiplicationTest() {
        assertEquals(8, math.multiplication(2, 4));
        assertEquals(MUL_METHOD,4, math.multiplication(2,2));
        assertEquals(MUL_METHOD,-4, math.multiplication(-2,2));
        assertEquals(MUL_METHOD,0, math.multiplication(-7,0));
        assertEquals(MUL_METHOD,0, math.multiplication(0,8));
        assertEquals(MUL_METHOD,4, math.multiplication(-2,-2));
        assertEquals(MUL_METHOD,-4, math.multiplication(2,-2));
        System.out.println("TEST MULTIPLICATION");
    }

    @Test
    public void divisionTest() {
        assertEquals(5, math.division(10, 2));
        assertEquals(DIV_METHOD,5, math.division(25, 5));
        assertEquals(DIV_METHOD,0, math.division(0, 7));
        assertEquals(DIV_METHOD,0, math.division(7, 0));
        assertEquals(DIV_METHOD,0, math.division(-7, 0));
        assertEquals(DIV_METHOD,0, math.division(7, -0));
        assertEquals(DIV_METHOD,0, math.division(-7, -0));
        System.out.println("TEST DIVISION");
    }

    @Test
    public void powTest(){
        assertEquals(POW_METHOD,25, math.pow(5,2));
        assertEquals(POW_METHOD,25, math.pow(-5,2));
        assertEquals(POW_METHOD,125, math.pow(5,3));
        System.out.println("POW");
    }
    @Test
    public void sRoot(){
        assertEquals(THE_ROOT,5, math.sqRoot(25));
        System.out.println("SQUARE ROOT");
    }

    @Test
    public void tearsDown() throws Exception{
        math = null;
        System.out.println("AFTER");
    }
    @Test
    public void reversWordsTest() {
        assertEquals(REVERS_METHOD,"Two One", math.reversWords("One Two"));
        assertEquals(REVERS_METHOD,"Geektech", math.reversWords("Geektech"));
        assertEquals(REVERS_METHOD,"Three Two One", math.reversWords("One Two Three"));
        assertEquals(REVERS_METHOD,"", math.reversWords(null));
        System.out.println("REVERS WORDS");
    }

    @After
    public void clear() {
        math = null;
        System.out.println("AFTER");
    }

}
