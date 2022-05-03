package week6;

public class TrinomialDP {
    public static long trinomial(int n, int k) {
        long[][] opt = new long[n + 1][n + 1];
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;
        opt[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) opt[i][j] = opt[i - 1][j - 1];
                else if (j == 0) opt[i][j] = opt[i - 1][j + 1] * 2 + opt[i - 1][j];
                else opt[i][j] = opt[i - 1][j - 1] + opt[i - 1][j] + opt[i - 1][j + 1];
            }
        }
        if (k < 0) return opt[n][Math.abs(k)];
        else return opt[n][k];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
