package factory;

public class Mini implements Car {
    @Override
    public void assemble() {
        System.out.println("MINI -- assembling");
    }
}
