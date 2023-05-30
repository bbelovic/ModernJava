package ocp.exam.ch9;

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
        arrayDeque.offerFirst("a");
        arrayDeque.offer("b");
        arrayDeque.addLast("c");
        arrayDeque.addLast("d");
        assertEquals("d", arrayDeque.getLast());
        assertEquals("a", arrayDeque.peekFirst());
        assertEquals("a", arrayDeque.peek());
        assertEquals("d", arrayDeque.peekLast());
        assertEquals("d", arrayDeque.pollLast());

        arrayDeque.offer("1");
        arrayDeque.clear();

        assertThrows(NoSuchElementException.class, arrayDeque::getLast);
        assertThrows(NoSuchElementException.class, arrayDeque::getFirst);
        assertThrows(NoSuchElementException.class, arrayDeque::removeFirst);
        assertThrows(NoSuchElementException.class, arrayDeque::removeLast);
        assertThrows(NoSuchElementException.class, arrayDeque::element);
        assertThrows(NoSuchElementException.class, arrayDeque::remove);
        assertNull(arrayDeque.peek());
        assertNull(arrayDeque.poll());

        arrayDeque.push("1");
        arrayDeque.push("2");
        arrayDeque.push("3");

        assertEquals("3", arrayDeque.pop());
        assertEquals(String.valueOf(2), arrayDeque.pop());
        assertEquals("1", arrayDeque.pop());

        System.out.println(arrayDeque);


    }


}
