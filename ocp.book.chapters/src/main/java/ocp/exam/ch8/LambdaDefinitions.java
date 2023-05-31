package ocp.exam.ch8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDefinitions {
    private int size = -1;
    public void definition1(List<Character> chars) {
        char start = 'a';

        this.size = 9;

        // not allowed
//        int c = 1;
//         char end = 'x';
//        chars = List.of();

        Predicate<Character> p = c -> {
            char end = 'z'; size = chars.size();
            return start <= c && c <= end;
        };

//        chars = List.of();
        char end = '#';
        int c = 4;
        size = -8;
//        p = 1;
//        start = 'x';

    }

    public void definitions2() {
        Consumer<Integer> c1 = (Integer e) -> System.out.println(e);
        Consumer<Integer> c2 = System.out::println;
        Consumer<Integer> c3 = (var e) -> System.out.println(e);
        Consumer<Integer> c4 = (final var e) -> System.out.println(e);
        Consumer<Integer> c5 = (final Integer e) -> System.out.println(e);
        Consumer<Integer> c6 = (final Integer e) -> System.out.println(e);

        var list = new ArrayList<>(List.of(1));
        list.sort((Integer x, Integer y) -> x - y);

        int x = 1;
        int z = 9;
        int zz = (int)9.1f;
        z += (x*8);
    }


}
