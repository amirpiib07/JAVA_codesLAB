package LAB_9;

import java.util.Scanner;
import java.util.Stack;

class ConvertThread extends Thread {
    String exp;

    ConvertThread(String exp) {
        this.exp = exp;
    }

    public void run() {
        String result = convert(exp);
        System.out.println("Infix Expression: " + result);
    }

    String convert(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String temp = "(" + op1 + c + op2 + ")";
                st.push(temp);
            }
        }
        return st.peek();
    }
}



public class q5PolishNotationInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prefix expression: ");
        String exp = sc.next();

        new ConvertThread(exp).start();
    }
}