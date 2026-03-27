package LAB_7;
// Enum for quiz result
enum Result {
    CORRECT, WRONG, UNANSWERED
}

public class QuizGrader4Q {
    public static void main(String[] args) {
        // Correct answers for 4 questions
        char[] correctAnswers = {'C', 'A', 'B', 'D'};

        // Submitted answers via program arguments
        // If not provided, use demo answers
        char[] submitted = new char[4];

        if (args.length >= 4) {
            for (int i = 0; i < 4; i++)
                submitted[i] = args[i].charAt(0);
        } else {
            // Demo: matches the sample output in the question
            char[] demo = {'C', 'B', 'B', 'D'};
            submitted   = demo;
        }

        int correct    = 0;
        int wrong      = 0;
        int unanswered = 0;

        System.out.println("QUESTION   SUBMITTED ANS   CORRECT ANS   RESULT");
        System.out.println("--------   -------------   -----------   ------");

        for (int i = 0; i < 4; i++) {
            Result result;

            if (submitted[i] == 'X') {
                result = Result.UNANSWERED;
                unanswered++;
            } else if (submitted[i] == correctAnswers[i]) {
                result = Result.CORRECT;
                correct++;
            } else {
                result = Result.WRONG;
                wrong++;
            }

            System.out.printf("%-11d%-15c%-14c%s%n",
                    (i + 1), submitted[i], correctAnswers[i], result);
        }

        System.out.println();
        System.out.println("No. of correct answers: " + correct);
        System.out.println("No. of wrong answers  : " + wrong);

        if (unanswered > 0)
            System.out.println("No. of unanswered     : " + unanswered);

        if (correct >= 2)
            System.out.println("The candidate PASSED.");
        else
            System.out.println("The candidate FAILED.");
    }
}