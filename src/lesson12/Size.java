package lesson12;

public enum Size {
    XXS(40) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(42), S(44), M(46), L(48);
    int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}