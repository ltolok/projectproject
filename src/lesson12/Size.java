package lesson12;

public enum Size {
    XXS(40) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(42), S(44), M(46), L(48);
    public int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + euroSize +
                '}';
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}