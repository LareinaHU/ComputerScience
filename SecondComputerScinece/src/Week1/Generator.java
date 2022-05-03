package Week1;

import edu.princeton.cs.algs4.StdRandom;

public class Generator {
    public static String randomString(int L, String alpha) {
        char[] a = new char[L];
        for (int i = 0; i < L; i++) {
            int t = StdRandom.uniform(alpha.length());
            System.out.println(t);
            a[i] = alpha.charAt(t);
        }
        return new String(a);
    }

    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        int L = Integer.parseInt(args[1]);
//        String alpha = args[2];
        int N = 10;
        int L = 5;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < N; i++) {
            System.out.println(randomString(L, alpha));
        }

    }
}
