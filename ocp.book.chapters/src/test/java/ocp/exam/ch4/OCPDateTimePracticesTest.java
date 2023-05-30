package ocp.exam.ch4;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

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
        System.out.println(expected.getOffset());
    }

    @Test
    public void testWinterDaylightSavingTime() {
        var date = LocalDate.of(2023, Month.NOVEMBER, 5);
        var time = LocalTime.of(1 ,30);
        var dateTime = ZonedDateTime.of(date, time, ZoneId.of("US/Eastern"));
        assertEquals("-04:00", dateTime.getOffset().toString());

        var first = dateTime.plus(Duration.ofHours(1));
        assertEquals("-05:00", first.getOffset().toString());
        int hour = first.getHour();
        int minute = first.getMinute();
        assertEquals(1, hour);
        assertEquals(30, minute);
        var second = first.plus(Duration.ofHours(1));
        assertEquals("-05:00", second.getOffset().toString());
        assertEquals(2, second.getHour());
        assertEquals(30, second.getMinute());
    }

    @Test
    public void testBetween() {
        var date = LocalDate.of(2023, Month.NOVEMBER, 5);
        var time = LocalTime.of(1 ,30);
        var dateTime1 = ZonedDateTime.of(date, time, ZoneId.of("US/Eastern"));
        ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
        long actual = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        assertEquals(1, actual);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        System.out.println("===");

        date = LocalDate.of(2023, Month.MARCH, 12);
        time = LocalTime.of(1, 30);
        dateTime1 = ZonedDateTime.of(date, time, ZoneId.of("US/Eastern"));
        dateTime2 = dateTime1.plus(1L, ChronoUnit.HOURS);
        actual = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        assertEquals(1, actual);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }
}