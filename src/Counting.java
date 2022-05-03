import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,8,9,0,3,5,6,7,6,4,3,2};
        int result[] = sort(arr);
    }
    public static int[] sort(int[] arr){
        int result[] = new int[arr.length];
        int Count[] = new int[10];
        for(int i = 0; i<arr.length;i++){
            Count[arr[i]]++;
        }
        System.out.println(Arrays.toString(Count));
        for(int i= 0,j =0;i<Count.length;i++){
            while(Count[i]-- >0) result[j++]=i;
        }
        return result;
    }
}
