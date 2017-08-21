package lesson11;

public class Drum implements Tool {
    private int size;

    public Drum(int s) {
        size = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return size == drum.size;
    }

    @Override
    public int hashCode() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {

        return size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                " Размер = " + getSize() +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Звучит барабан.   " + toString());
    }
}
