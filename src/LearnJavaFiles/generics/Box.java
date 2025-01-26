package LearnJavaFiles.generics;

// Declaring a class that needs a parameter <T> (placeholder) when declared
public class Box<T> {

    // Think of T as thing. We don't know the datatype, so we set it as 't'
    // It's a common naming convention

    T item;

    // We can put things in our box
    public void setItem(T item) {
        this.item = item;
    }

    // We can get things from our box
    public T getItem() {
        return this.item;
    }

}
