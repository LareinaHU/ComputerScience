package week4;
//
//public class WorldMap {
//    public static void main(String[] args) {
//        String[] widthAndHeight = StdIn.readLine().split(" ");
//        int width = Integer.parseInt(widthAndHeight[0]);
//        int height = Integer.parseInt(widthAndHeight[1]);
//
//        StdDraw.setXscale(0, width);
//        StdDraw.setYscale(0, height);
//
//        while (StdIn.hasNextLine()) {
//            String s = StdIn.readLine();
//            if (s.isEmpty()) continue;
//            if (!Character.isDigit(s.charAt(0))) continue;
//            int verticals = Integer.parseInt(s);
//            double [] xs = new double[verticals], ys = new double[verticals];
//            for (int i = 0; i < verticals; i++) {
//                xs[i] = StdIn.readDouble();
//                ys[i] = StdIn.readDouble();
//            }
//            StdDraw.polygon(xs, ys);
//        }
//
//        StdDraw.show();
//    }
//}
//
