package ocp.exam.ch7;

import java.util.Collection;

public class InnerNestedLocalAnonExample {
    private final int x = 0;

    private class Inner {
        int x = InnerNestedLocalAnonExample.this.x;
    }

    private final static class Nested1 {
        private Nested1() {

        }

        public void iter(Collection<Integer> c) {
            var instance = new InnerNestedLocalAnonExample();
            for (var each: c) {
                instance.new Anon() {
                    @Override
                    void moo() {
                        instance.new Inner();
                    }
                };

                class A {}
                new A();
            }
//            var aa = new A();
        }
    }

    abstract class Anon {
        abstract void moo();
    }

    public static void main(String $_x[]) {
        new Nested1();
    }

}
