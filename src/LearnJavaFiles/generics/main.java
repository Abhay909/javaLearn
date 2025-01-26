package LearnJavaFiles.generics;

public class main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        // **** USING 1 PARAMETER ******
        // use wrapper classes when declaring the type argument
        // <String>, <Integer>, <Character>, <Boolean>

        Box<String> box = new Box<>();
        box.setItem("banana");
        // System.out.println(box.getItem());

        // **** USING 2 PARAMETERS ******

        Product<String, Double> product1 = new Product<>("iphone", 900.0);

        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getItem() + ": $" + product1.getPrice());
        System.out.println(product2.getItem() + ": $" + product2.getPrice());


    }
}
