package ocp.exam.ch3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExampleTest {
    private final SwitchExample example = new SwitchExample();
    @Test
    public void test1() {
//        assertThrows(NullPointerException.class, () -> example.example1(null));
        assertEquals(8, example.example1("xxx"));


    }

}