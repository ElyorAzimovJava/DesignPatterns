package factory;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car SUV = carFactory.getCar("SUV");
        SUV.assemble();

        Car sedan  = carFactory.getCar("sedan");
        sedan.assemble();

        Car mini = carFactory.getCar("mini");
        mini.assemble();
    }
}
