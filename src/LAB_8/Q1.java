package LAB_8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        int first = line.indexOf("the");
        int last  = line.lastIndexOf("the");

        if (first == -1) {
            System.out.println("The string 'the' was not found.");
        } else if (first == last) {
            System.out.println("'the' occurs only once at index: " + first);
            System.out.println("No substring between two occurrences.");
        } else {
            System.out.println("First occurrence of 'the' at index: " + first);
            System.out.println("Last  occurrence of 'the' at index: " + last);

            // Extract characters enclosed BETWEEN the two positions
            // i.e., from (first + 3) up to (last - 1) inclusive
            String between = line.substring(first + 3, last);
            System.out.println("Characters between the two occurrences: \"" + between + "\"");
        }

        sc.close();
    }
}