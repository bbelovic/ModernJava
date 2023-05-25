package ocp.exam.ch9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Assertions.assertEquals(List.of(0L, 1L, 4L, 4L), actual);


        copy = new ArrayList<>(animals);
        copy.sort(byIdAscThenNameAsc);

        List<String> actual2 = copy.stream().map(Animal::name).toList();
        Assertions.assertEquals(List.of("Parrot", "Dolphin", "Cacadu", "Elephant"), actual2);
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

        Assertions.assertEquals(List.of(67, 55, 24, 23), copy1.stream().map(Person::age).toList());

        var copy2 = new ArrayList<>(persons);

        copy2.sort(Collections.reverseOrder());
        Assertions.assertEquals(List.of(23, 24, 55, 67), copy2.stream().map(Person::age).toList());


        Comparator<Person> byName = Comparator.comparing(Person::name);

        var copy3 = new ArrayList<>(persons);

        Assertions.assertEquals(List.of("Jane", "Jon", "Marty", "oto"), copy3.stream().sorted(byName).map(Person::name).toList());
        Assertions.assertEquals(List.of("oto", "Marty", "Jon", "Jane"), copy3.stream().sorted(byName.reversed()).map(Person::name).toList());


    }

}
