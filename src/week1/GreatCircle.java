

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double x11 = Math.toRadians(x1);
        double y1 = Double.parseDouble(args[1]);
        double y11 = Math.toRadians(y1);
        double x2 = Double.parseDouble(args[2]);
        double x22 = Math.toRadians(x2);
        double y2 = Double.parseDouble(args[3]);
        double y22 = Math.toRadians(y2);
        double r = 6371.0;
        double d1 = Math.sin((x22 - x11) / 2);
        double d2 = Math.sin((y22 - y11) / 2);
        double descriminat = d1 * d1 + Math.cos(x11) * Math.cos(x22) * d2 * d2;
        double d = 2 * r * Math.asin(Math.sqrt(descriminat));
        System.out.println(d + " kilometers");

    }
}
