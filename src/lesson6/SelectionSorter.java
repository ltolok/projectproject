package lesson6;

public class SelectionSorter {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 0;
        array[1] = 2;
        array[2] = 0;
        array[3] = 1;
        array[4] = 3;
        array[5] = 1;
        sort(array);
        System.out.println("Массив отсортирован :");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + "  ");
        }
    }


    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            boolean t = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    x = array[j];
                    t = true;
                }
            }
            if (t != false) {
                array[k] = array[i];
                array[i] = x;
            }
        }
    }
}


