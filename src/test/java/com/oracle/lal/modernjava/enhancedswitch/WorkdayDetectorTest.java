package com.oracle.lal.modernjava.enhancedswitch;

import org.junit.jupiter.api.Test;

import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static org.junit.jupiter.api.Assertions.*;

class WorkdayDetectorTest {
    private final WorkdayDetector detector = new WorkdayDetector();
    @Test
    public void detectWorkdayTheOldWay() {
        assertFalse(detector.isWorkdayOldStyle(SATURDAY));
        assertTrue(detector.isWorkdayOldStyle(MONDAY));
    }

    @Test
    public void detectWorkDayJava17Way() {
        assertFalse(detector.isWorkday(SATURDAY));
        assertTrue(detector.isWorkday(MONDAY));
    }

    @Test
    public void computeWorkPaceForDay() {
        var actual = detector.workPace(MONDAY);
        assertEquals(10, actual);
    }

}