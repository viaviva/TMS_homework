package homework.homework14.exercise2;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();

        for (int i = 0; i < 5; i++)
        {
            BufferThread bufferThread = new BufferThread(reentrantLock);
            bufferThread.start();
            bufferThread.join();
        }

        System.out.println(Buffer.getList());
    }
}
