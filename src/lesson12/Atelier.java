package lesson12;

public class Atelier {
    @Override
    public String toString() {
        return "Atelier{}";
    }

    public static void main(String[] args) {
        Clothing[] clothing = new Clothing[6];
        clothing[0] = new Tshirt();
        clothing[0].setSize(Size.M);
        clothing[0].setColor("голубой");
        clothing[0].setCost(100.00);

        clothing[1] = new Tshirt();
        clothing[1].setSize(Size.XXS);
        clothing[1].setColor("белый");
        clothing[1].setCost(120.00);

        clothing[2] = new Pants();
        clothing[2].setSize(Size.L);
        clothing[2].setColor("черный");
        clothing[2].setCost(500.00);

        clothing[3] = new Pants();
        clothing[3].setSize(Size.S);
        clothing[3].setColor("белый");
        clothing[3].setCost(600.00);

        clothing[4] = new Tie();
        clothing[4].setColor("красный");
        clothing[4].setCost(250.00);

        clothing[5] = new Skirt();
        clothing[5].setSize(Size.XS);
        clothing[5].setColor("синий");
        clothing[5].setCost(700.00);
        clotheaMan(clothing);
        clotheaWomen(clothing);

    }

    private static void clotheaMan(Clothing clothing[]) {
        System.out.println("Одеть мужчину:");
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof MensClothing) {
                ((MensClothing) clothing1).clotheaMan();
            }
        }
    }

    private static void clotheaWomen(Clothing clothing[]) {
        System.out.println("Одеть женщину:");
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof WomensClothing) {
                ((WomensClothing) clothing1).clotheaWomen();
            }
        }
    }
}
