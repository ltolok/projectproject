package lesson11;

public class Orchestra {
    public static void main(String[] args) {
        Tool[] tools = new Tool[3];
        tools[0] = new Guitar(6);
        System.out.println();
        tools[1] = new Trumpet(23);
        tools[2] = new Drum(50);
        for (Tool tool : tools) {
            tool.play();
        }
    }
}