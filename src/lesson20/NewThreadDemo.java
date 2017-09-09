package lesson20;

public class NewThreadDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('A');
        NewThread Thread1 = new NewThread(stringBuilder);
        Thread1.setName("Thread 1");
        Thread1.start();
        NewThread Thread2 = new NewThread(stringBuilder);
        Thread2.setName("Thread 2");
        Thread2.start();
        NewThread Thread3 = new NewThread(stringBuilder);
        Thread3.setName("Thread 3");
        Thread3.start();


    }
}

