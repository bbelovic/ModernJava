package ocp.exam.ch7;

public interface Example1 {
    public static final int ID = 42;

    public static void hunt() {}
    public abstract int getId();
    public default int getDefaultId() {
        return ID;
    }

    private static boolean isDummy() {
        hunt();
        // not allowed
        //var notDummy = notDummy();
        return ID == 42;
    }; // <- semicolon optional, but allowed

    private boolean notDummy() {
        var isDummy = isDummy();
        return getId() > getDefaultId();
    }
}
