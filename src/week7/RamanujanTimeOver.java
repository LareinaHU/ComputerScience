package week7;

public class RamanujanTimeOver {
    public static void main(String[] args) {
        Long n = Long.parseLong(args[0]);
        //   long n = 958595904;
        if (isRamanujan(n) == true) {
            System.out.println("true");
        } else System.out.println("false");
    }

    public static boolean isRamanujan(long n) {

        int count = 0;
        for (long a = 1; a < n; a++) {
            long a3 = a * a * a;
            if (a3 > n) {
                break;
            }
            for (long b = a + 1; b < n; b++) {
                long b3 = b * b * b;
                if (a3 + b3 > n) {
                    break;
                }
                if (a3 + b3 == n) {
                    count++;
                }
            }
        }
        return count >= 2;
    }
}

