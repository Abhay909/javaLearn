package Projects;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // JAVA QUIZ GAME
        // QUESTIONS array []

        String[] questions = {"Using correct form of Estar: Joe y Maria ___ correndo.",
                              "Que hora es? 2:58.",
                              "Hoy es abril. Que estacion es?",
                              "Como se dice 'learn'?",
                              "Como se dice 'happy'?",
                              "Como estas?"};

        // OPTIONS array[] []
        String [][] options = {{"1. estoy", "2. estan", "3. esta", "4. estamos" },
                               {"1. tarde", "2. medianoche", "3. manana", "4. noches"},
                               {"1. verano ", "2. invierno", "3. otono", "4. la primavera"},
                               {"1. aprrender", "2. contestar", "3. ensenar", "4. hablar"},
                               {"1. bueno", "2. enchanta", "3. conteno", "4. feliz"},
                               {"1. Soy bein", "2. Mi es bien", "3. Estoy bien", "4. Gracias"}};


        // DECLARE VARIABLES
        int[] answer = {2, 1, 4, 1, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("***********************");
        System.out.println("Welcome to Quiz Game!");
        System.out.println("***********************");

        // QUESTION (Loop) VI
        for (int i = 0; i < options.length; i++) {
            // OPTIONS
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            // GET GUESS FROM USER
            System.out.print("Enter your choice: ");
            guess = scanner.nextInt();

            // CHECK OUR GUESS
            if (guess == answer[i]) {
                System.out.println("*******");
                System.out.println("Correct");
                System.out.println("*******");
                score++;
            } else {
                System.out.println("*******");
                System.out.println(" WRONG ");
                System.out.println("*******");
            }
        }
        System.out.println("**********************");
        // DISPLAY FINAL SCORE|
        System.out.println("Your Score was: " + score + "/" + questions.length);
        System.out.println("**********************");




        scanner.close();
    }
}