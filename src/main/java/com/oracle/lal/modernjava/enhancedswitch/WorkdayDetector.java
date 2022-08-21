package com.oracle.lal.modernjava.enhancedswitch;

import java.time.DayOfWeek;

public class WorkdayDetector {
    public boolean isWorkdayOldStyle(DayOfWeek dayOfWeek) {
        boolean workday = false;
        switch (dayOfWeek) {
            case SATURDAY: workday = false; break;
            case SUNDAY: workday = false; break;
            case MONDAY: workday = true; break;
            case TUESDAY: workday = true; break;
            case WEDNESDAY: workday = true; break;
            case THURSDAY: workday = true; break;
            case FRIDAY: workday = true; break;
        }
        return workday;
    }












    public boolean isWorkday(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SATURDAY, SUNDAY -> false;
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
        };
    }
}
