package ocp.exam.ch8;

import java.util.List;
import java.util.function.Predicate;

public class LambdaDefinitions {
    private int size = -1;
    public void definition1(List<Character> chars) {
        char start = 'a';

        this.size = 9;

        // not allowed
        // char end = 'x';
        //chars = List.of();

        Predicate<Character> p = c -> {
            char end = 'z'; size = chars.size();
            return start <= c && c <= end;
        };

        int end = 20;
    }
}
