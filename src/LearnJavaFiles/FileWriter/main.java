package LearnJavaFiles.FileWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class main {

    public static void main(String[] args) {


        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\a9kap\\IdeaProjects\\javalearn\\src\\LearnJavaFiles\\FileWriter\\test.txt";
        String textContent = """
                Roses are red,
                Violets are blue,
                Checking the comments,
                To see if its true.
                """;

        try(FileWriter writer = new FileWriter(filePath)) {

            writer.write(textContent);
            System.out.println("File has been written");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Could not write to file");
        }



    }
}
