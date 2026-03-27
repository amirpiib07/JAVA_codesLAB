package LAB_8;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_TrimAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String[] names = new String[n];

        System.out.println("Enter 10 names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Delete first 3 characters from each name
        String[] trimmed = new String[n];
        for (int i = 0; i < n; i++) {
            if (names[i].length() > 3) {
                trimmed[i] = names[i].substring(3);
            } else {
                // If name has 3 or fewer chars, result is empty string
                trimmed[i] = "";
            }
        }

        // Sort alphabetically (case-insensitive)
        Arrays.sort(trimmed, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\nNames after removing first 3 characters (alphabetical order):");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + trimmed[i]);
        }

        sc.close();
    }
}