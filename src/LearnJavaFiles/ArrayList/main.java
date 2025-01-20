package LearnJavaFiles.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the number of food you would like: ");

        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }


        System.out.println(foods);


        scanner.close();
        //
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("coconut");
        fruits.add("banana");

        // fruits.remove(0);

        // fruits.set(0, "pineapple");

        // Sort
        Collections.sort(fruits);

        for (String fruit : fruits) {
            // System.out.println(fruit);
        }


    }
}
