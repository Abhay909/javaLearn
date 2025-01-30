package TestFiles.Store;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Store {
    public static void main(String[] args) {
        GetItems dairy_bakery = new GetItems();
        ArrayList<String> items = dairy_bakery.getItems("src/TestFiles/Store/dairy_bakery.txt");

        if (items.isEmpty()) {
            System.out.println("No items found in the file.");
            return;
        }

        Random random = new Random();
        String item = items.get(random.nextInt(items.size()));

        System.out.println("Random item: " + item);
    }
}

class GetItems {
    public ArrayList<String> getItems(String filePath) {
        ArrayList<String> items = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return items;
    }
}
