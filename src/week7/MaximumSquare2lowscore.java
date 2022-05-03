package week7;

import java.util.Random;

public class MaximumSquare2lowscore {public static int size(int[][] a) {
    int size;
    for (int i = 1; i < a.length; i++) {
        for (int j = 1; j < a[0].length; j++) {
            a[i][j] = a[i][j] + Math.min(Math.min(a[i - 1][j - 1], a[i - 1][j]), a[i][j - 1]);
        }
    }
    int max = 0;
    int min = a[0][0];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (max < a[i][j]) {
                max = a[i][j];//算出最大值
            }
        }
    }
    return max;
}

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        //    int n = 10;
        Random rd = new Random();
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
