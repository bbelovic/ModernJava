package ocp.exam.ch11;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

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
        actual = examples.format("00.0000", 200_111.199D);
        assertEquals("200111.1990", actual);
    }

    @Test
    public void testParse() throws ParseException {
        var usInput = "$333,555.12";
        NumberFormat usCurrencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        Number actual = usCurrencyInstance.parse(usInput);
        assertEquals(333_555.12, actual);
    }

    @Test
    public void testCompact() {
        assertEquals("6M", NumberFormat.getCompactNumberInstance().format(6_499_999));
        assertEquals("6Mln", NumberFormat.getCompactNumberInstance(Locale.ITALIAN, NumberFormat.Style.SHORT).format(6_499_999));
        assertEquals("6 million", NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG).format(6_499_999));
    }

}