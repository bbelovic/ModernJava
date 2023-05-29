package ocp.exam.ch6;

import ocp.exam.ch5.pond.Duck;

public class Daughter extends Mother {
    int age;
    public void printAge(boolean b) {

    }

    public boolean isOld() {
        return age > 40;
    }

    static void validate(Mother m) {

    }

    public boolean isOld(Mother m) {
        return false;
    }

    @Override
    public Daughter create() {
        return new Daughter();
    }

    public Daughter create(long id) {
        return new Daughter();
    }
    public static Daughter create(long id, String name) {
        return new Daughter();
    }
}
