package LearnJavaFiles.arrayOfObjects;

public class arrayOfObjects {

    public static void main(String[] args) {
        Car[] cars = {new Car("ford", "black"),
                new Car("tesla", "red"),
                new Car("Toyota", "blue")};

        for (Car car : cars) {
            car.drive();
        }
    }

}