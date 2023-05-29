package ocp.exam.ch3;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class InstanceOfTest {
    public void test1() {
        doTest(List.of(1, 2, 3));
        doTest(Set.of(0, 0, 0));

    }

    private static void doTest(Collection<Number> c) {
        if (c instanceof List<Number> nums) {
            System.out.println(nums.size());
        } else if (c instanceof Set<Number> nums) {
            System.out.println("set " + nums.isEmpty());
        } else {
            System.out.println("??");
        }
    }
}
