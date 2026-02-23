package LAB_4;

import java.util.Scanner;

public class q4 {

    static boolean isPerfect(String s) {
        boolean[] seen = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen[c]) return false;
            seen[c] = true;
        }
        return true;
    }

    static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        s = sc.nextLine();
        System.out.println(isPerfect(s));
    }
}

