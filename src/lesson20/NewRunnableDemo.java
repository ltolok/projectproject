package lesson20;

public class NewRunnableDemo {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();
        Thread thread1 = new Thread(newRunnable);
        thread1.setName("Thread 1");
        Thread thread2 = new Thread(newRunnable);
        thread2.setName("Thread 2");
        Thread thread3 = new Thread(newRunnable);
        thread3.setName("Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
