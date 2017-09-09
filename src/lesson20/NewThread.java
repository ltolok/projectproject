package lesson20;

public class NewThread extends Thread {
    private StringBuilder stringBuilder;

    public NewThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder + "  " + Thread.currentThread().getName());
            }
            char letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }
}
