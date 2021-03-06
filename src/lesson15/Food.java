package lesson15;

public class Food {
    public void prepare
            (Cookable c) {
        c.cook();
    }
    public void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовим вместе");
            }
        });
    }
}