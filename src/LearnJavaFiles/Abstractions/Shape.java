package LearnJavaFiles.Abstractions;

public abstract class Shape {

    abstract double area(); // ABSTRACT needs to be implemented by the children's classes

    void display() { // Concrete method
        System.out.println("This is a shape");
    }

}
