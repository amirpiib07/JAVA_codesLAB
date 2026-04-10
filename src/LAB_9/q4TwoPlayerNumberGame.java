package LAB_9;

import java.util.*;

public class q4TwoPlayerNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1 enter a number: ");
        int p1 = sc.nextInt();

        System.out.print("Player 2 enter a number: ");
        int p2 = sc.nextInt();

        Random r = new Random();

        int r1 = r.nextInt(100);
        int r2 = r.nextInt(100);

        System.out.println("Player1 random: " + r1);
        System.out.println("Player2 random: " + r2);

        if (r1 > r2) {
            System.out.println("Player 1 wins, points = " + (r1 - r2));
        } else if (r2 > r1) {
            System.out.println("Player 2 wins, points = " + (r2 - r1));
        } else {
            System.out.println("Draw!");
        }
    }
}