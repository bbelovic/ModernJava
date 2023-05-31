package ocp.exam.ch10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingExample {
    private record Pair(int sum, int cnt) {}
    @Test public void teeing1() {
        Stream<Integer> first = Stream.of(10, 20, 30);
        Stream<Integer> second = Stream.of(40, 50);
        var result = Stream.concat(second, first)
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.counting(), (x, y) -> new Pair(x, y.intValue())));
        Assertions.assertEquals(new Pair(150, 5), result);
    }
}
