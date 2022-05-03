import java.util.Arrays;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        int n = 10;

        //初始化给定范围的待选数组
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int[] result = new int[n];
        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < n; i++) {
            //待选数组0到(len-2)随机一个下标
            index = Math.abs(rd.nextInt() % n--);
            //将随机到的数放入结果集
            result[i] = a[index];
            //将待选数组中被随机到的数，用待选数组(len-1)下标对应的数替换
            a[index] = a[n];
        }

    }
}
