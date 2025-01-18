package LearnJavaFiles.MethodOverriding;

public class Fish extends Animal{

    // Good practice so you and other devoilopers knwo tht im overriding the orignal animal command because fish cant run
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }

}
