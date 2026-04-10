package LAB_9;

class PrimeThread extends Thread {
    public void run() {
        int count = 0, num = 2;

        while (count < 25) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
}

class FibThread extends Thread {
    public void run() {
        int a = 0, b = 1;
        for(int i=0;i<50;i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class q6PrimeFibonacciThread {
    public static void main(String[] args) throws Exception {
        PrimeThread p = new PrimeThread();
        FibThread f = new FibThread();

        p.setPriority(8);
        f.setPriority(5);

        p.start();
        p.join(); // after 25 primes

        Thread.sleep(1000);
        f.start();
    }
}