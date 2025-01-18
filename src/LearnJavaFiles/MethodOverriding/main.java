package LearnJavaFiles.MethodOverriding;

public class main {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own implementation of a method that is already defined.
        // * Allows for code reusability and gives specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        fish.move();
        cat.move();
    }
}
