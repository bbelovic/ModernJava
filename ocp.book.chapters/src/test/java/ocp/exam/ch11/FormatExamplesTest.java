package ocp.exam.ch11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatExamplesTest {
    private final FormatExamples examples = new FormatExamples();
    @Test
    public void testFormatExamples() {
        String actual = examples.format("#####.0##", 11.129D);
        assertEquals("11.129", actual);
        actual = examples.format("#####.0#", 11.1999D);
        assertEquals("11.2", actual);
        actual = examples.format("##.0000", 11.199D);
        assertEquals("11.1990", actual);
        actual = examples.format("#000.0000", 11.199D);
        assertEquals("011.1990", actual);
        actual = examples.format("000000.0000", 200_111.199D);
        assertEquals("200111.1990", actual);
    }

}