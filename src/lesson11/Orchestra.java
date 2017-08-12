package lesson11;

public class Orchestra {
    public static void main(String[] args) {
        Tool[] tools = new Tool[3];
        tools[0] = new Guitar();
        tools[1] = new Trumpet();
        tools[2] = new Drum();
        for (Tool tools1 : tools) {
            tools1.play();
        }
    }
}