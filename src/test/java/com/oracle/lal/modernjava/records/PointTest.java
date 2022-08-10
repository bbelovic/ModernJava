package com.oracle.lal.modernjava.records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void pointsAreEqual() {
        Assertions.assertEquals(Point.ZERO, new Point(0L, 0L, 0L));
    }

    @Test
    public void samePointsSameHashCode() {
        Assertions.assertTrue(Point.ZERO.hashCode() == new Point(0L, 0L, 0L).hashCode());
    }
}
