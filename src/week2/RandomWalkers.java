package week2;

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double ave = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0, steps = 0;
            while (!(Math.abs(x) + Math.abs(y) == r)) {
                double t = Math.random();
                if (t <= 0.25) ++x;
                else if (t <= 0.5) ++y;
                else if (t <= 0.75) --x;
                else --y;
                steps++;
            }
            ave += steps;
        }
        System.out.println("average number of steps = " + ave / trials);
    }
}
