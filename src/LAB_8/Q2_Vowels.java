package LAB_8;

import java.util.Scanner;

public class Q2_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        String vowels = "aeiouAEIOU";
        boolean found = false;

        System.out.println("Vowel\tPosition");
        System.out.println("-----\t--------");

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                System.out.println("  " + ch + "\t   " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vowels found in the input.");
        }

        sc.close();
    }
}
