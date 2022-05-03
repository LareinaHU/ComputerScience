package week6;

public class RevesPuzzle {

    private static void moveTo(int disc, String from, String to) {
        System.out.println("Move disc " + disc + " from " + from + " to " + to);
    }

    private static void hanoi3(int n, String from, String to, String ss, int sma) {
        if (n > 0) {
            hanoi3(n - 1, from, ss, to, sma);
            moveTo(sma + n - 1, from, to);
            hanoi3(n - 1, ss, to, from, sma);
        }
    }

    private static void hanoi4(int n, String from, String to, String ss1, String ss2) {
        if (n == 0) return;
        if (n == 1) {
            moveTo(1, from, to);
        } else {
            int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
            hanoi4(k, from, ss1, to, ss2);
            hanoi3(n - k, from, to, ss2, k + 1);
            hanoi4(k, ss1, to, from, ss2);
        }
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        //    int n = 4;

        hanoi4(n, "A", "D", "B", "C");
    }
}