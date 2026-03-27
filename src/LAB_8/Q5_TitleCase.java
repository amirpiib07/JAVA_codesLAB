package LAB_8;

import java.util.Scanner;

public class Q5_TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        if (line.isEmpty()) {
            System.out.println("Input is empty.");
            sc.close();
            return;
        }

        StringBuilder result = new StringBuilder();
        // Split preserving spaces by iterating character by character
        boolean newWord = true;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == ' ') {
                result.append(ch);
                newWord = true;              // next non-space starts a new word
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    result.append(ch);
                }
            }
        }

        System.out.println("Result: " + result.toString());
        sc.close();
    }
}