package week1;

public class RightTriangle {
    public static void main(String[] args) {

        int a = 7, b = 25, c = 24;
        boolean isRightTriangle;
        isRightTriangle = (a * a + b * b == c * c) && (a > 0) && (b > 0) && (c > 0);
        System.out.println(isRightTriangle);
    }
}
