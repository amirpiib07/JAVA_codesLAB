package LAB_9;

class Bank {
    int balance = 600;

    synchronized void deposit() {
        int amt = (int)(Math.random()*200) + 1;
        balance += amt;
        System.out.println("Father deposits: " + amt + " Balance: " + balance);
    }

    synchronized void withdraw() {
        int amt = (int)(Math.random()*150) + 1;
        if(balance >= amt) {
            balance -= amt;
            System.out.println("Son withdraws: " + amt + " Balance: " + balance);
        }
    }
}

class Father extends Thread {
    Bank b;
    Father(Bank b) { this.b = b; }

    public void run() {
        while (true) {
            if (b.balance < 2000)
                b.deposit();
        }
    }
}

class Son extends Thread {
    Bank b;
    Son(Bank b) { this.b = b; }

    public void run() {
        while (true) {
            if (b.balance > 2000)
                b.withdraw();
        }
    }
}

public class q7FatherSonBankAccountThreadSync {
    public static void main(String[] args) {
        Bank b = new Bank();

        Father f = new Father(b);
        Son s = new Son(b);

        f.start();
        s.start();
    }
}
