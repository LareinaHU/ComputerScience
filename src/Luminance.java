import java.awt.*;

public class Luminance {
    public static double lum(Color c) {
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        return .229 * r + .587 * g + .114 * b;
    }

    public static void main(String[] args) {
        int r = 200;
        int g = 100;
        int b = 50;
        Color c = new Color(r, g, b);
        StdOut.println(Math.round(lum(c)));
    }


}
