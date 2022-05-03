import java.util.ArrayList;
import java.util.List;


class User {
    public static void hanoi(int n, String a, String b, String c) {
        if (n == 0) return;
        hanoi(n - 1, a, c, b);
        System.out.println("Move stics " + n + " From " + a + " to " + c);
        hanoi(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, "A", "B", "C");
    }

}




