package lesson12.task1;

public enum Seasons {
    WINTER(-7), SPRING(5), SUMMER(22) {
        public String getDescription() {
            return "Теплое время время года";
        }
    }, AUTUMN(7);

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
