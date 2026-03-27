package LAB_5;
// Enum for quiz result
enum QuizResult {
    CORRECT, WRONG, UNANSWERED
}

public class QuizGrader {
    public static void main(String[] args) {
        // Correct answers
        char[] correctAnswers = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};

        // Submitted answers passed as program arguments
        // If not provided, use default for demonstration
        char[] submitted = new char[8];

        if (args.length >= 8) {
            for (int i = 0; i < 8; i++)
                submitted[i] = args[i].charAt(0);
        } else {
            // Default submitted answers for demo
            char[] demo = {'C', 'B', 'B', 'D', 'B', 'C', 'A', 'X'};
            submitted    = demo;
        }

        int correct     = 0;
        int wrong       = 0;
        int unanswered  = 0;

        System.out.println("QUESTION   SUBMITTED ANS   CORRECT ANS   RESULT");
        System.out.println("--------   -------------   -----------   ------");

        for (int i = 0; i < 8; i++) {
            QuizResult result;

            if (submitted[i] == 'X') {
                result = QuizResult.UNANSWERED;
                unanswered++;
            } else if (submitted[i] == correctAnswers[i]) {
                result = QuizResult.CORRECT;
                correct++;
            } else {
                result = QuizResult.WRONG;
                wrong++;
            }

            System.out.printf("%-11d%-15c%-14c%s%n",
                    (i + 1), submitted[i], correctAnswers[i], result);
        }

        System.out.println();
        System.out.println("No. of correct answers  : " + correct);
        System.out.println("No. of wrong answers    : " + wrong);
        System.out.println("No. of unanswered       : " + unanswered);

        if (correct >= 5)
            System.out.println("The candidate PASSED.");
        else
            System.out.println("The candidate FAILED.");
    }
}