package EvaluationOfLab;


import java.util.Stack;

class ConverterThread extends Thread {
    private String postfix;
    private String infix;

    public ConverterThread(String postfix) {
        this.postfix = postfix;
    }

    public String getInfix() {
        return infix;
    }

    @Override
    public void run() {
        Stack<String> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String b = stack.pop();
                String a = stack.pop();
                String expr = "(" + a + c + b + ")";
                stack.push(expr);
            }
        }
        infix = stack.pop();
        System.out.println("Converted Infix Expression: " + infix);
    }
}

class EvaluationThread extends Thread {
    private String postfix;
    private double result;

    public EvaluationThread(String postfix) {
        this.postfix = postfix;
    }

    public double getResult() {
        return result;
    }

    @Override
    public void run() {
        Stack<Double> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // For simplicity, assign values: A=10, B=5, C=20, D=4
                switch (c) {
                    case 'A': stack.push(10.0); break;
                    case 'B': stack.push(5.0); break;
                    case 'C': stack.push(20.0); break;
                    case 'D': stack.push(4.0); break;
                }
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        result = stack.pop();
        System.out.println("Evaluation Result: " + result);
    }
}

public class Lab_9_Q5 {
    public static void main(String[] args) {
        String postfix = "AB*CD/+";

        ConverterThread converter = new ConverterThread(postfix);
        EvaluationThread evaluator = new EvaluationThread(postfix);

        converter.start();
        evaluator.start();

        try {
            converter.join();
            evaluator.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Infix: " + converter.getInfix());
        System.out.println("Final Result: " + evaluator.getResult());
    }
}