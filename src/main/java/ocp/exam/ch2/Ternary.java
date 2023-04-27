package ocp.exam.ch2;

public class Ternary {
    public int example1() {
        int c = 2, d = 5;
        int e = c < 10 ? ++d : d--;
        return e;
    }
}
