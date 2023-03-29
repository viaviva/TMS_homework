package homework.homework14.exercise3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++)
        {
            BufferThread bufferThread = new BufferThread();
            bufferThread.start();
            bufferThread.join();
        }

        System.out.println(Buffer.getList());
    }
}
