package homework.homework14.exercise2;

import java.util.concurrent.locks.ReentrantLock;

public class BufferThread extends Thread {
    private ReentrantLock reentrantLock;

    public BufferThread(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        System.out.println(getName());
        Buffer.add();
        reentrantLock.unlock();
    }
}
