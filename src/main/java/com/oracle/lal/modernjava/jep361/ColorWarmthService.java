package com.oracle.lal.modernjava.jep361;

public class ColorWarmthService {
    public String getColorWarmth(Color color) {
        return switch (color) {
            case RED, ORANGE, MAGENTA -> "warm";
            case GREY -> "cold";
            case BLUE, GREEN, WHITE -> "neutral";
        };
    }
}
