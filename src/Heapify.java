import java.util.Arrays;

public class Heapify {
    public static void main(String[] args) {
        int[] a = {56, 23, 10, 3, 5, 11, 2};
        heapify(a,0);
        System.out.println(Arrays.toString(a));
        buildHeapify(a);
        System.out.println(Arrays.toString(a));

    }


    public static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void heapify(int[] a, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
      //  if (i <=0) return;
        int max = i;
        if (left < a.length && a[left] > a[i]) max = left;
        if (right < a.length && a[right] > a[max]) max = right;
        if (max != i) {
            swap(a, max, i);
            heapify(a, max);
        }
    }
    public static void buildHeapify(int[] a){
        for(int i =(a.length-1)/2;i>=0;i--){
            heapify(a,i);
        }
    }
//
//    public static void heapify_sort(int[] a) {
//        for (int i = a.length; i >= 0; i--) {
//            heapify(a, a.length - i);
//            swap(a, a.length, 0);
//
//        }
//    }
}

