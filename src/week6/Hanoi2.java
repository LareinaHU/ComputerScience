package week6;

public class Hanoi2 {
    private static void moveD(int disc, String A, String D) {
        System.out.println("Move disc " + disc + " A " + A + " D " + D );
    }

    private static void hanoi3(int n, String A, String D, String B, int smallestDisc) {
        if (n > 0) {
            hanoi3(n - 1, A, B, D, smallestDisc);
            moveD(smallestDisc + n - 1, A, D);
            hanoi3(n - 1, B, D, A, smallestDisc);
        }
    }

    private static void hanoi4(int n, String A, String D, String B1, String B2) {
        if (n == 0) return;
        if (n == 1) {
            moveD(1, A, D);
        } else {
            int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
            hanoi4(k, A, B1, D, B2);
            hanoi3(n - k, A, D, B2, k + 1);
            hanoi4(k, B1, D, A, B2);
        }
    }


    public static void main(String[] args) {
     //   Integer n = Integer.parseInt(args[0]);
        int n = 5;
        hanoi4(n, "A", "D", "B", "C");
    }
}
