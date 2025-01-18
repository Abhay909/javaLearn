package LearnJavaFiles.toString;

public class Car {

    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.make + " " + this.model + " " + this.year + " " + this.color;
    }


}
