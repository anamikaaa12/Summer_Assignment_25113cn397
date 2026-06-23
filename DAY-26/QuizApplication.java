import java.util.*;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user info
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid age input.");
            return;
        }
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        // Quiz questions
        String[] questions = {
            "1. What is the capital of India?\nA) Mumbai\nB) New Delhi\nC) Kolkata\nD) Chennai",
            "2. Which planet is known as the Red Planet?\nA) Earth\nB) Mars\nC) Jupiter\nD) Venus",
            "3. Who is known as the Father of Java?\nA) James Gosling\nB) Dennis Ritchie\nC) Bjarne Stroustrup\nD) Guido van Rossum"
        };
        char[] answers = {'B', 'B', 'A'};
        int score = 0;

        System.out.println("\n=== Quiz Started ===");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String ans = sc.nextLine().trim().toUpperCase();
            if (ans.length() == 1 && ans.charAt(0) == answers[i]) {
                score++;
            }
        }

        // Result
        System.out.println("\n=== Quiz Result ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score + "/" + questions.length);
        sc.close();
    }
}
