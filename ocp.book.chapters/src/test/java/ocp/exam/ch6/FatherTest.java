package ocp.exam.ch6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatherTest {

    @Test
    public void testFieldHiding() {
        assertEquals(0, Father.f1);
        assertEquals(0, new Father().f1);
        assertEquals(10, new Child().f1);

        Father father = new Child();
        assertEquals(0, father.f1);
    }
}