package OOP;

public class OOP {
public static void main(String[] args) {
    // Object = An entity that holds data (attributes)
    // and can preform actions (methods)
    // it is a reference data type

    Car car = new Car();
    Car car2 = new Car();

    // car.isOn = true;

    // System.out.println(car.make);
    // System.out.println(car.model);
    // System.out.println(car.year);
    // System.out.println(car.price);
    // System.out.println(car.isOn);


    System.out.println(car.isOn);
    car.start();
    System.out.println(car.isOn);
    car.stop();
    System.out.println(car.isOn);

    car.drive();
    car.brake();

    System.out.println(car.make + " " + car.model);
    System.out.println(car2.make + " " + car2.model);

    

    }
}
