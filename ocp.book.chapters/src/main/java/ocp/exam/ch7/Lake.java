package ocp.exam.ch7;

public class Lake implements /*IsRiver,*/ IsWater{
    @Override
    public boolean isBlue() {
        return false;
    }
}
