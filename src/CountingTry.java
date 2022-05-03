import java.util.Arrays;

public class CountingTry {


    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 0, 0, 2, 3, 4, 5, 6, 7, 5, 4, 3, 2, 5, 6, 7, 8, 9, 9, 0, 8, 7, 6, 5, 4, 3, 4, 6, 6, 7, 7, 8, 9, 7};
        //   int[] Count = new int[10];
        int k[] = Sort(arr);
        System.out.println(Arrays.toString(k));
    }

    public static int[] Sort(int[] arr) {
        int result[] = new int[arr.length];
        int[] Count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Count[arr[i]]++;
        }
        System.out.println(Arrays.toString(Count));
        for (int i = 0, j = 0; i < Count.length; i++) {
            while (Count[i]-- > 0) result[j++] = i;
        }


        return result;
    }
}
