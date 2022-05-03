package week6;

public class Hanoi {
    public static String hanoi(int n, boolean left) {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n - 1, !left) + move + hanoi(n - 1, !left);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(hanoi(n, false));
    }
}


//
//    public static void main(String[] args) {
//        int n = 2;
//        //  System.out.println(hanoi(n, false));
//        hanoi(n, "A", "B", "C");
//
//    }

//    private static String hanoi2(int n, boolean isLeft) {
//        if (n == 1) return 1 + (isLeft ? "L " : "R ");
//        String move = n + (isLeft ? "L " : "R ");
//        return hanoi2(n - 1, !isLeft) + move + hanoi2(n - 1, !isLeft);
//    }

//    public static String hanoi(int n, boolean isleft) {
//        if (n == 0) return " ";
//        String move;
//        if (isleft) move = n + "L";
//        else move = n + "R";
//        return hanoi(n - 1, !isleft) + move + hanoi(n - 1, !isleft);
//    }
//
//    public static void hanoi(int n, String A, String B, String C) {
//        if( n == 0) return;
//        hanoi(n - 1, A, C, B);
//        System.out.println("Move disc" + n + " from " + A + "to " + C);
//        hanoi(n - 1, B, A, C);
//    }
//}
