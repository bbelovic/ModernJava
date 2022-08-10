package com.oracle.lal.modernjava.records;

public record Point(long x, long y, long z) implements Translateable {
    public static final Point ZERO = new Point(0L, 0L, 0L);
    @Override
    public Point translate(long dx, long dy, long dz) {
        return new Point(this.x + dx, this.y + dy, this.z + dz);
    }

    public static Point of(long x, long y, long z) {
        return new Point(x, y, z);
    }
}
