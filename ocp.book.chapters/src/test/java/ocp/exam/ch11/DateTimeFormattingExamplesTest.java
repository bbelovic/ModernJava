package ocp.exam.ch11;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeFormattingExamplesTest {
    private final DateTimeFormattingExamples examples = new DateTimeFormattingExamples();

    @Test
    public void testIncompatibleFormats() {
        assertThrows(DateTimeException.class, () -> examples.incompatibleFormats(LocalDate.now(), "H: mm a"));
        assertThrows(DateTimeException.class, () -> examples.incompatibleFormats(LocalDate.now(), "YYYY z"));
        assertEquals("year is 2023", examples.incompatibleFormats(LocalDate.now(), "'year is' YYYY"));
    }

}