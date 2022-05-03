package week7;

import java.util.Random;

public class MaximumSquareSubmatrix {

    public static int size(int[][] a) {
        if (a.length == 0 || a[0].length == 0) {
            return 0;
        }
        int M = a.length, N = a[0].length, size = 0;
        int[][] dp = new int[M][N];
        for (int i = 0; i < M; i++) {
            if (a[i][0] == 1) {
                dp[i][0] = 1;
                size = 1;
            }
        }

        for (int j = 0; j < N; j++) {
            if (a[0][j] == 1) {
                dp[0][j] = 1;
                size = 1;
            }
        }
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                if (a[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
                size = Math.max(size, dp[i][j]);
            }
        }
        return size;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt();
        //    int n = 10;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(2);
                //          System.out.print(a[i][j] + " ");
            }
            //        System.out.println();
        }
//        System.out.println("-------------");

        System.out.println(size(a));

    }
}
