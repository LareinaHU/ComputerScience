package week3;

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        // int n = 31;
        // int trials = 1000000;
        int countpeople[] = new int[n];
        double sum[] = new double[n];
        double ave = 0;
        for (int i = 0; i < trials; i++) {
            boolean[] Hit = new boolean[n];
            for (int j = 1; j <= n; j++) {
                int r = (int) (n * (Math.random()));
                if (Hit[r]) {
                    countpeople[j]++;
                    break;
                } else {
                    Hit[r] = true;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + countpeople[i];
            ave = sum[i] / trials;
            System.out.println(i + "  " + countpeople[i] + "  " + ave);
            if (ave >= 0.5) return;
        }
    }
}