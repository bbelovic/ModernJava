package ocp.exam.ch6;

public class Mother implements Identifiable{
    int age;

    private void printAge(boolean toErr) {
        System.out.println(age);
    }

    public boolean isOld() throws Exception {
        return age > 50;
    }



    static void validate(Mother m) {
        if (m.age < 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public long id() {
        return 0L;
    }

    protected Identifiable create() {
        return new Mother();
    }
}
