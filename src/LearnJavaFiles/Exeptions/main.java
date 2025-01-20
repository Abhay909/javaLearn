package LearnJavaFiles.Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("YOU CANT DIVIDE BY ZERO");
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("this always exacutes");
        }




    }

}
