package LAB_9;

import java.util.*;

class SinThread extends Thread {
    double x;
    SinThread(double x) { this.x = x; }

    public void run() {
        double sin = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2*i+1) / fact(2*i+1);
            sin += term;
        }
        System.out.println("sin(" + x + ") = " + sin);
    }

    double fact(int n) {
        double f = 1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
}

class CosThread extends Thread {
    double x;
    CosThread(double x) { this.x = x; }

    public void run() {
        double cos = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2*i) / fact(2*i);
            cos += term;
        }
        System.out.println("cos(" + x + ") = " + cos);
    }

    double fact(int n) {
        double f = 1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
}

public class q3MultithreadingSinxCosxUsingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x (in radians): ");
        double x = sc.nextDouble();

        new SinThread(x).start();
        new CosThread(x).start();
    }
}