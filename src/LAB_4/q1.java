package LAB_4;

import java.util.Scanner;

public class q1 {

    static void set(int[] arr, int x, int y, int z, int Y, int Z, int val) {
        arr[x * Y * Z + y * Z + z] = val;
    }

    static int get(int[] arr, int x, int y, int z, int Y, int Z) {
        return arr[x * Y * Z + y * Z + z];
    }

    static void main(String[] args) {
        int X, Y, Z;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        int[] arr = new int[X * Y * Z];

        set(arr, 1, 1, 1, Y, Z, 99);
        System.out.println(get(arr, 1, 1, 1, Y, Z));
    }
}

