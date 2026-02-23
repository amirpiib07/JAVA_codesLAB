package LAB_4;

import java.util.Scanner;

public class q3 {

    static void printN(String s, int n) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            //if (freq[s.charAt(i)] == n)
                System.out.print(s.charAt(i) + " "+ freq[s.charAt(i)]);
    }

    static void main(String[] args) {
        String s;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        s = sc.nextLine();
        System.out.println("enter the repetitions: ");
        n = sc.nextInt();
        printN(s, n);
    }
}

