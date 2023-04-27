package ocp.exam.ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TernaryTest {
    @Test
    public void testExample1() {
        int actual = new Ternary().example1();
        assertEquals(6, actual);
    }

}