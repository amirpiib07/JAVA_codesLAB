package LAB_9;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class q2ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}