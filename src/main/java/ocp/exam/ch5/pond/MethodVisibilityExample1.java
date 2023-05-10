package ocp.exam.ch5.pond;

import ocp.exam.ch5.shore.Bird;

public class MethodVisibilityExample1 {
    public static void main(String[] args) {
        Goosling g = new Goosling();
        // not in goosling object
        g.tweet();
    }
}
