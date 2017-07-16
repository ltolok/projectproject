package lesson6;

public class Bsort {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 5;
        array[5] = 4;
        sort(array);
        System.out.println("Массив отсортирован :");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + "  ");
        }
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean t = false;
            for (int j = array.length-1 ; j > i; j--) {

                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    t = true;
                }
            }
            if (!t) {
                return;
            }
        }
    }
}
