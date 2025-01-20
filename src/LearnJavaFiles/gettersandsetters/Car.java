package LearnJavaFiles.gettersandsetters;

public class Car {

    // Final is an extra security measure to make the variable non-writeable
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Getter methods make a field readable
    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }


    // Setter Methods
    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {

        if (price < 0) {
            System.out.println("Price cant be less than 0");
        } else {
            this.price = price;
        }
    }

}
