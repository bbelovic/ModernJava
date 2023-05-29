package ocp.exam.ch9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    @Test
    public void sort1() {
        Comparator<Animal> byIdAsc = (a1, a2) -> (int) (a1.id() - a2.id());

        Comparator<Animal> byIdAscThenNameAsc = byIdAsc.thenComparing(Animal::name);

        List<Animal> animals = List.of(new Animal(0L, "Parrot"), new Animal(1, "Dolphin"),
                new Animal(4, "Elephant"), new Animal(4L, "Cacadu"));

        var copy = new ArrayList<>(animals);
        copy.sort(byIdAsc);

        List<Long> actual = copy.stream().map(Animal::id).toList();
        assertEquals(List.of(0L, 1L, 4L, 4L), actual);


        copy = new ArrayList<>(animals);
        copy.sort(byIdAscThenNameAsc);

        List<String> actual2 = copy.stream().map(Animal::name).toList();
        assertEquals(List.of("Parrot", "Dolphin", "Cacadu", "Elephant"), actual2);
    }

    private record Person(long id, int age, String name) implements Comparable<Person> {

        @Override
        public int compareTo(Person o) {
            return o.age - age;
        }
    }
    @Test
    public void sort2() {

        var persons = List.of(new Person(0L, 55, "Jon"), new Person(2L, 23, "Marty"),
                new Person(2, 24, "Jane"), new Person(4, 67, "oto"));

        var copy1 = new ArrayList<>(persons);

        Collections.sort(copy1);

        assertEquals(List.of(67, 55, 24, 23), copy1.stream().map(Person::age).toList());

        var copy2 = new ArrayList<>(persons);

        copy2.sort(Collections.reverseOrder());
        assertEquals(List.of(23, 24, 55, 67), copy2.stream().map(Person::age).toList());


        Comparator<Person> byName = Comparator.comparing(Person::name);

        var copy3 = new ArrayList<>(persons);

        assertEquals(List.of("Jane", "Jon", "Marty", "oto"), copy3.stream().sorted(byName).map(Person::name).toList());
        assertEquals(List.of("oto", "Marty", "Jon", "Jane"), copy3.stream().sorted(byName.reversed()).map(Person::name).toList());


    }


    @Test
    public void sort3() {
        // ape, cobra, elephant, parrot, snake, stork, whale

        // ape, snake, whale, stork, cobra, parrot, elephant

        // ape, cobra, snake, stork, whale, parrot, elephant

        var immutable = List.of("snake", "whale", "ape", "parrot", "stork", "cobra", "elephant");
        Assertions.assertThrows(Exception.class, () -> immutable.sort(Comparator.naturalOrder()));
        var sortable = new ArrayList<>(immutable);
        sortable.sort(Comparator.naturalOrder());
        int actual = Collections.binarySearch(sortable, "cobra");
        assertEquals(1, actual);
        actual = Collections.binarySearch(sortable, "rat");
        assertEquals(-5, actual);


        var c = Comparator.comparing(String::length).thenComparing(s->s.charAt(0));
        sortable = new ArrayList<>(immutable);
        sortable.sort(Comparator.comparing(String::length).thenComparing(s->s.charAt(0)));
        actual = Collections.binarySearch(sortable, "coyote", c);
        assertEquals(-6, actual);

        var c2 = Comparator.comparing(String::length, (f, s) -> s - f);
        sortable = new ArrayList<>(immutable);
        sortable.sort(c2);
        assertEquals("elephant", sortable.get(0));
        assertEquals("ape", sortable.get(sortable.size() - 1));

        // ape, cobra, snake, stork, whale, parrot, elephant
        // elephant parrot cobra snake stork whale ape
        sortable = new ArrayList<>(immutable);
        sortable.sort(c2.thenComparing(s -> s.charAt(0)));
        assertEquals(List.of("elephant", "parrot", "cobra", "snake", "stork", "whale", "ape"),
                sortable);
    }
}
