package homework.homework14.exercise3;

public class BufferThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
        Buffer.add();
    }
}
