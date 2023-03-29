package homework.homework14.exercise1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread("1");
        MyThread thread2 = new MyThread("2");
        MyThread thread3 = new MyThread("3");

        thread3.start();
        thread3.join();
        thread2.start();
        thread2.join();
        thread1.start();
    }
}
