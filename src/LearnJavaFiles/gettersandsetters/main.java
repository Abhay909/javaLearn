package LearnJavaFiles.gettersandsetters;

public class main {

    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.


        // Getters make a private variable usable in other files.
        // Setters make a private variable editable in other files.

        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
