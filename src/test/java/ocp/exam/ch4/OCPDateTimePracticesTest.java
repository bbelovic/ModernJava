package ocp.exam.ch4;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

class OCPDateTimePracticesTest {
    private final OCPDateTimePractices underTest = new OCPDateTimePractices();
    @Test
    public void testSummerDaylightSavingTime() {
        ZonedDateTime actual = underTest.summerDaylightSavingTime(Duration.ofHours(1));
        var date = LocalDate.of(2023, Month.MARCH, 12);
        var time = LocalTime.of(3, 30);
        ZonedDateTime expected = ZonedDateTime.of(date, time, ZoneId.of("US/Eastern"));
        assertEquals(expected, actual);
    }

}