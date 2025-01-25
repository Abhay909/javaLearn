package LearnJavaFiles.MethodOverriding;

public class Fish extends Animal{

    // Good practice, so you and other developers know tht im overriding the original animal command because fish cant run
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }

}
