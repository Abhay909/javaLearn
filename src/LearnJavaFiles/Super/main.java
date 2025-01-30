package LearnJavaFiles.Super;

public class main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println("*************");
        Dog dog = new Dog();
        System.out.println("*************");
        fish.display();
    }

}

class Animal {

    int numOfAnimals = 100000;

    // Parent constructor
    Animal() {
        System.out.println("I am an animal!");
    }

    // Parent method
    void display() {
        System.out.println("Parent Method");
    }

}

class Fish extends Animal {
    Fish() {
        // Super keyboard inherits everything within the parent constructor.
        super();
        System.out.println("I am a fish");
        System.out.println("There are " + super.numOfAnimals + " animals in this world");
    }

    void display() {
        super.display();
        System.out.println("Child method");
    }
}

class Dog extends Animal{
    Dog() {
        super();
        System.out.println("I am a dog");
    }

    void display() {
        super.display();
        System.out.println("Child method");
    }
}




