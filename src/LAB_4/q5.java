package LAB_4;

import java.util.Scanner;

public class q5 {

    static int digits(int n) {
        int d = 0;
        while (n > 0) {
            d++;
            n /= 10;
        }
        return d;
    }

    static boolean containsPattern(int num, int pat) {
        int len = digits(pat);
        int div = 1;

        for (int i = 0; i < len; i++)
            div *= 10;

        while (num >= pat) {
            if (num % div == pat) return true;
            num /= 10;
        }
        return false;
    }

    static int count(int a, int b, int p) {
        int c = 0;
        for (int i = a; i <= b; i++)
            if (containsPattern(Math.abs(i), p)) c++;
        return c;
    }

    static void main(String[] args) {
        System.out.println("enter the range: ");
        int a, b, patt;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter the pattern you want to count: ");
        patt = sc.nextInt();
        System.out.println(count((a),(b) , patt));
    }
}

