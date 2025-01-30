package LearnJavaFiles.generics;

// A common convention for adding more than one parameter is using T, then U, then V
// Algebraical order
public class Product<T, U>{

    // The datatype of the item is T
    T item;
    U price;

    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    // We are returning an item, and the datatype of the item we are returning is T.
    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return this.price;
    }


}
