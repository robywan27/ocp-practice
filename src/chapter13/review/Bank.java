package chapter13.review;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Bank {
    private Lock vault = new ReentrantLock();
    private int total = 0;

    public void deposit(int value) {
        try {
            vault.tryLock(); // if false is returned then an exception is thrown
            total += value;
        }
        finally {
            vault.unlock(); // this causes the exception when the lock is not obtained®
        }
    }

    public static void main(String[] args) {
        var bank = new Bank();
        IntStream.range(1, 10).parallel().forEach(bank::deposit);
        System.out.println(bank.total); // 45 ONLY if all 10 threads obtain the lock
    }
}
