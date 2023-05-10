package ocp.exam.ch5.pond;

import ocp.exam.ch5.shore.Bird;

public class Goosling extends Bird {
    public void goose() {
        String tweet = tweet();
        boolean canFloat = canFloatInWater();
    }

    public void helpOtherGooseSwim() {
        Bird bird = new Goosling();
        bird.tweet();
        Goosling goosling = new Goosling();
        goosling.tweet();
    }
}
