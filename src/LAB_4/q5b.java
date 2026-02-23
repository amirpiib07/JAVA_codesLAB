package LAB_4;

import java.util.Scanner;

public class q5b {
    static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter the pattern number that have to count: ");
        int c = sc.nextInt();
        System.out.print("number of occurances of " + c + " in the range is ");
        System.out.println(occurances(a, b, c));
    }

    private static int occurances(int a, int b, int c) {
        int count = 0;
        String ans = toString(c);
        for (int i = a; i <= b; i++) {
            String helper = toString(i);
            if (contain(helper, ans)) count++;
        }
        return count;
    }

    private static boolean contain(String helper, String ans) {
        int i = 0;
        int j = 0;
        while (i < helper.length() && j < ans.length()) {
            if (helper.charAt(i) == ans.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == ans.length();
    }

    private static String toString(int i) {
        String ans = "";
        ans += i;
        return ans;
    }
}
