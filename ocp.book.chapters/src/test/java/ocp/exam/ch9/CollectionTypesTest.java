package ocp.exam.ch9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTypesTest {
    @Test
    public void example1() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(null);
        assertNull(list1.get(0));

        Set<String> names = new TreeSet<>();
        assertThrows(Exception.class, () -> names.add(null));

        Set<String> names2 = new HashSet<>();
        names2.add(null);
        names2.add("null");
        names2.add("john doe");
        names2.add("jane doe");


        assertEquals(4, names2.size());
        names2.removeIf(Objects::isNull);
        assertEquals(3, names2.size());
        names2.removeIf(e -> e.contains("doe"));
        assertEquals(1, names2.size());
    }

    @Test public void example2() {
        Queue<String> queue = new LinkedList<>();
        queue.add("blabol");
        queue.add(null);
        queue.add("franta");
        queue.offer("ex");

        assertEquals(true, queue.offer("ocp"));
        assertEquals("blabol", queue.peek());
        assertEquals("blabol", queue.poll());
        assertEquals(null, queue.element());
        assertEquals(null, queue.remove());

        queue.remove();
        queue.poll();
        queue.poll();
        assertTrue(queue.isEmpty());

        assertThrows(NoSuchElementException.class, () -> queue.remove());
        assertThrows(Exception.class, () -> queue.element());

        assertNull(queue.poll());
        assertNull(queue.peek());
    }

    @Test
    public void example3() {
        Deque<String> deque = new LinkedList<>();
        assertDoesNotThrow(() -> deque.addFirst(null));
        Deque<String> arrayDeque = new ArrayDeque<>();
        assertThrows(NullPointerException.class, () -> arrayDeque.addFirst(null));
    }
}
