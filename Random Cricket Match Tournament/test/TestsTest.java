import org.junit.Test;

import static org.junit.Assert.*;

public class TestsTest {

    Tests t = new Tests();

    @Test
    public void Toss(){
        int actual = t.Toss();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void dotBall() {
        int actual = t.dotBall();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void run1() {
        int actual = t.run1();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void run2() {
        int actual = t.run2();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void run3() {
        int actual = t.run3();
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void four() {
        int actual = t.four();
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void six() {
        int actual = t.six();
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void wide() {
        int actual = t.wide();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void noBall() {
        int actual = t.noBall();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void wicket() {
        int actual = t.wicket();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void matchResult(){
        boolean actual = t.matchResult();
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void playerScore(){
        int actual = t.playerScore();
        int expected = 15;
        assertEquals(expected,actual);
    }
}