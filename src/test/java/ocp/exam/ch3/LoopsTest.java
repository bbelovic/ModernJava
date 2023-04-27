package ocp.exam.ch3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {
    @Test
    public void testExample1() {
        int[] actual = new Loops().example1();
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(new int[] {0, 2}, actual);
    }

    @Test
    public void testExample2() {
        new Loops().example2();
    }
}