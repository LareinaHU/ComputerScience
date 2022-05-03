package week5;

public class Divisors {
    public static int gcd(int a, int b) {

        int m = Math.abs(a);
        int n = Math.abs(b);
        if (m == 0 || n == 0) {
            return Math.max(m, n);
        } else if (m < n) {
            int p = m;
            m = n;
            n = p;
        }
        while (m % n != 0) {
            int c = m % n;
            m = n;
            n = c;
        }
        return n;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
//        int a = 1640957;
//        int b = 1653787;
        int c = gcd(a, b);
        int d = lcm(a, b);
        boolean m = areRelativelyPrime(a, b);
        int x = totient(a);
        int y = totient(b);
        System.out.println("gcd(" + a + ", " + b + ") = " + c);
        System.out.println("lcm(" + a + ", " + b + ") = " + d);
        System.out.println("areRelativelyPrime(" + a + ", " + b + ") = " + m);
        System.out.println("totient(" + a + ") = " + x);
        System.out.println("totient(" + b + ") = " + y);
    }

    //  Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0 || gcd(a, b) == 0) {
            return 0;
        } else {
            return Math.abs(a) * Math.abs(b) / gcd(a, b);
        }
    }

    //    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        while (gcd(a, b) == 1) {
            return true;
        }
        return false;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
//        int count = 0;
//        for (int i = 1; i < n; i++) {
//            if (gcd(i, n) == 1) {
//                count++;
//
//            }
//        }
//        return count;
//    }
        int result = 0;
        for (int i = 1; i < Math.abs(n); i++) {
            if (areRelativelyPrime(i, n)) {
                result++;
            }
        }
        return result;
    }
}