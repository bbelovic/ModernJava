package ocp.exam.ch10;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {
    @Test public void test() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Spliterator<Integer> spliterator = integers.spliterator();
        Spliterator<Integer> half1 = spliterator.trySplit();
        half1.forEachRemaining(System.out::print);
        System.out.println("==");
        spliterator.forEachRemaining(System.out::print);
        System.out.println("==");

//        Spliterator<Integer> half2 = spliterator.trySplit();
//        half2.forEachRemaining(System.out::print);
//        Spliterator<Integer> half3 = spliterator.trySplit();
//        half3.forEachRemaining(System.out::print);

    }
}
