package LAB_9;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}

public class q1ThreadUsingThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}