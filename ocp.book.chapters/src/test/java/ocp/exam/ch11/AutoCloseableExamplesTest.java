package ocp.exam.ch11;

import org.junit.jupiter.api.Test;

class AutoCloseableExamplesTest {
    private final AutoCloseableExamples examples = new AutoCloseableExamples();
    @Test
    public void testExample4() {
        examples.example4();

    }

    @Test
    public void testExample5() throws Exception {
//        int e = 0;
        try (var r1 = new NaughtyARMResource(() -> new IllegalArgumentException("exc: "+ 0), 0)) {
            throw new NullPointerException("try block");
        } catch (Exception | Error e) {
            System.out.println("in catch -> "+ e.getMessage());
            e.printStackTrace();
//            throw e;

        }
    }

}