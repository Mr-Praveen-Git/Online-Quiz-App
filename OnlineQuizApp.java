
import java.util.Scanner;

public class OnlineQuizApp {

    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Online Quiz Application");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nHello " + name + "! Let's start the quiz.\n");

        askQuestion("Which language is used for Android development?",
                    "a) Python", "b) Kotlin", "c) Swift", "d) JavaScript", "b");

        askQuestion("Which keyword is used to create a class in Java?",
                    "a) function", "b) method", "c) class", "d) define", "c");

        askQuestion("Which data structure uses FIFO?",
                    "a) Stack", "b) Queue", "c) Array", "d) LinkedList", "b");

        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/3");
    }

    public static void askQuestion(String question, String opt1, String opt2, String opt3, String opt4, String correctAns) {
        System.out.println(question);
        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);
        System.out.println(opt4);
        System.out.print("Enter your answer (a/b/c/d): ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase(correctAns)) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is: " + correctAns + "\n");
        }
    }
}
