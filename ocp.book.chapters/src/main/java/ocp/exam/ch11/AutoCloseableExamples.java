package ocp.exam.ch11;

import java.io.IOException;
import java.util.function.Supplier;

public class AutoCloseableExamples {
    public void example1() {
        try (var res1 = new PoliteARMResource(1);
            var res2 = new PoliteARMResource(2)
        ) {
            System.out.println("in try block 1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void example2() {
        try (var res1 = new PoliteARMResource(1);
             var res2 = new NaughtyARMResource(() -> new IOException("io from naughty" + 10), 10);
             var res3 = new NaughtyARMResource(() -> new RuntimeException("runtime from naughty" + 20), 20)
        ) {
            System.out.println("in try block 2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void example3() {
        try (var res1 = new PoliteARMResource(1);
             var res2 = new NaughtyARMResource(() -> new IOException("io from naughty"), 10);
             var res3 = new NaughtyARMResource(() -> new RuntimeException("runtime from naughty"), 20)
        ) {
            throw new RuntimeException("ex from try block");
        } catch (Exception e) {
            System.err.println("Caught exception with message: " + e.getMessage());
            System.err.println("Supressed:");
            for (var ex: e.getSuppressed()) {
                System.err.println("Supressed: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        AutoCloseableExamples examples = new AutoCloseableExamples();
//        examples.example1();
        System.out.println("=================");
        examples.example2();
        System.out.println("=================");
//        examples.example3();
    }
}

class PoliteARMResource implements AutoCloseable {
    private final int id;

    PoliteARMResource(int id) {
        this.id = id;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing resource: " + id);
    }
}

class NaughtyARMResource implements AutoCloseable {
    private final Supplier<Exception> exceptionSupplier;
    private final int id;

    NaughtyARMResource(Supplier<Exception> exceptionSupplier, int id) {
        this.exceptionSupplier = exceptionSupplier;
        this.id = id;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing naughty: " + id);
        throw exceptionSupplier.get();
    }
}
