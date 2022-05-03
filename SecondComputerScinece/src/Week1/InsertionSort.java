package Week1;

public class InsertionSort {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                }
            }
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void main(String[] args) {
        Integer[] a = {134, 435465, 765, 56, 465, 25};
        sort(a);
        for (Integer array : a) {
            System.out.println(array);
        }



    }
}
