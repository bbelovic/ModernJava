package com.oracle.lal.modernjava.enhancedswitch;

import java.time.DayOfWeek;

public class WorkdayDetector {
    public boolean isWorkdayOldStyle(DayOfWeek dayOfWeek) {
        boolean workday = false;
        switch (dayOfWeek) {
            case SATURDAY, SUNDAY:
                workday = false;
                System.out.printf("%s is not workday%n", dayOfWeek);
                break;
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                workday = true;
                System.out.printf("%s is workday%n", dayOfWeek);
                break;
            case FRIDAY:
                workday = true;
                System.out.printf("%s is workday%n", dayOfWeek);
                break;
            default: throw new IllegalArgumentException("Unknown day: "+ dayOfWeek);
        }
        return workday;
    }












    public boolean isWorkday(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SATURDAY, SUNDAY -> false;
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->  true;
        };
    }

    public int workPace(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SATURDAY, SUNDAY -> 0;
            case MONDAY -> 10;
            case TUESDAY ->  20;
            case WEDNESDAY -> {
                if (isBeforeEndOfSprint(dayOfWeek)) {
                    yield 70;
                } else {
                    yield 50;
                }
            }

            case THURSDAY ->  throw new IllegalArgumentException();
            case FRIDAY -> 10;
        };

    }

    private boolean isBeforeEndOfSprint(DayOfWeek dayOfWeek) {
        return false;
    }
}
