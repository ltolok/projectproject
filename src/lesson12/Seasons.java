package lesson12;

public enum Seasons {
    WINTER(-7), SPRING(5), SUMMER(22) {
        public String getDescription() {
            return "Теплое время время года";
        }
    }, AUTUMN(7);

    Seasons(int temperature) {
        this.temperatire = temperature;
    }

    private int temperatire;

    public int getTemperatire() {
        return temperatire;

    }

    public String getDescription() {
        return "Холодное время года";
    }
}
