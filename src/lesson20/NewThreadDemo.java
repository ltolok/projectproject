package lesson20;

public class NewThreadDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");
        NewThread thread1 = new NewThread(stringBuilder);
        thread1.setName("Thread 1");
        thread1.start();
        NewThread thread2 = new NewThread(stringBuilder);
        thread2.setName("Thread 2");
        thread2.start();
        NewThread thread3 = new NewThread(stringBuilder);
        thread3.setName("Thread 3")
        ;
        thread3.start();
    }
}


