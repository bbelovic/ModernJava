package ocp.exam.ch3;

public class SwitchExample {
    public int example1(String sp) {
        int result ;
        var s = sp;
        switch (s) {
            case "blabol0111" -> result = 9;
            case "example" -> result = 8;
            case ";" -> result = -9;
            default -> result = 7;
        }
        return result;
    }

    private String getInput() {
        return "";
    }
}
