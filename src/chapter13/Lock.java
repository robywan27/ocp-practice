package chapter13;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Lock {
    public static void main(String[] args) {
        var lock = new ReentrantReadWriteLock();
        lock.readLock().lock();
        lock.writeLock().lock();

    }
}
