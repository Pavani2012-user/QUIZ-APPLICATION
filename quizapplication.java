  import java.util.Scanner;

    public class quizapplication {
        public static void main(String[] args) {
           try( Scanner scanner = new Scanner(System.in)){
    
            // Questions, options, and answers
            String[] questions = {
                "1. What is the capital of France?",
                "2. Who wrote 'Romeo and Juliet'?",
                "3. What is the square root of 64?"
            };
    
            String[][] options = {
                {"a. Paris", "b. Madrid", "c. Berlin", "d. Rome"},
                {"a. William Wordsworth", "b. William Shakespeare", "c. Charles Dickens", "d. Mark Twain"},
                {"a. 6", "b. 7", "c. 8", "d. 9"}
            };
    
            char[] answers = {'a', 'b', 'c'};
    
            int score = 0;
    
            System.out.println("Welcome to the Quiz Application!");
            System.out.println("Answer the following questions by typing the option letter (a, b, c, or d):\n");
    
            // Quiz logic
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (String option : options[i]) {
                    System.out.println(option);
                }
    
                System.out.print("Your answer: ");
                char answer = scanner.next().toLowerCase().charAt(0);
    
                if (answer == answers[i]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer was " + answers[i] + ".\n");
                }
            }
    
            // Display score
            System.out.println("Quiz Over!");
            System.out.println("You scored " + score + " out of " + questions.length);
    
            scanner.close();
        }
    }
}
