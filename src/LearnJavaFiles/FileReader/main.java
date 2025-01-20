package LearnJavaFiles.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\a9kap\\IdeaProjects\\javalearn\\src\\LearnJavaFiles\\FileReader\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println();
            System.out.println("Could not locate file.");

        } catch (IOException e){
            System.out.println("Something went wrong");

        }


    }

}
