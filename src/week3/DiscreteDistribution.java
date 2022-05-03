package week3;

public class DiscreteDistribution {


    public static void main(String[] args) {
        int n = args.length - 1;
        int m = Integer.parseInt(args[0]);
        int delta[] = new int[args.length];
        int[] a = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
            delta[i] = delta[i - 1] + a[i];
        }

        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * (delta[n] - 1));
            int k = 0;
            while (r >= delta[k]) {
                k++;
            }
            System.out.print(k + " ");
        }
        System.out.println();
    }
}



