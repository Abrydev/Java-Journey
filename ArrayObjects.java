package ArrayObjects;

public class ArrayObjects {
    public static void main(String[] args) {
        // Car car1 = new Car("Mustang", "red");
        // Car car2 = new Car("Corvette", "Blue");
        // Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {new Car("Mustang", "red"),
         new Car("Corvette", "Blue"),
         new Car("Charger", "Yellow")};

        // for(int i = 0; i < cars.length; i++){
        //     cars[i].drive();
        // }

        for(Car car : cars){
            car.color = "Black";
        }

        for(Car car : cars){
            car.drive();
        }
    }
}
