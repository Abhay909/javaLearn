package LearnJavaFiles.toString;

public class main {
    public static void main(String[] args) {
        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details

        Car car1 = new Car("Tesla", "Y", 2025, "red");
        Car car2 = new Car("Jeep", "Gladiator", 2021, "grey");

        System.out.println(car1);
        System.out.println(car2);

    }
}
