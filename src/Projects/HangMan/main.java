package Projects.HangMan;

// file readers
import java.io.FileReader;
import java.io.BufferedReader;

// catches exceptions
import java.io.FileNotFoundException;
import java.io.IOException;

// utils
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Java Hangman Game

        // File path of a text file
        String filePath = "src/Projects/HangMan/words.txt";

        // create an arraylist for words from the txt
        ArrayList<String> words = new ArrayList<>();

        // enclose everything in a try block for security reasons
        // Using a buffer reader to read multiple lines of text in a txt file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Trim any extra spaces
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }


        } catch(FileNotFoundException e) {
            System.out.println("Could not find file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));


            System.out.print("Word: ");

            for(char c : wordState) {
                System.out.print(c + " ");
            }

            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess!");

                for(int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }

            } else {
                System.out.println("Incorrect Guess!");
                wrongGuesses++;
            }
        }

        if (wrongGuesses >= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }


        scanner.close();



    }

    static String getHangmanArt(int wrongGuesses) {
        return switch(wrongGuesses) {
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                       0
                      
                      
                      
                      """;
            case 2 -> """
                       0
                       |
                      
                      
                      """;
            case 3 -> """
                       0
                      /|
                      
                      
                      """;
            case 4 -> """
                       0
                      /|\\
                      
                      
                      """;
            case 5 -> """
                       0
                      /|\\
                      /
                      """;
            case 6 -> """
                       0
                      /|\\
                      / \\
                      
                      """;
            default -> "";

        };
    }

}
