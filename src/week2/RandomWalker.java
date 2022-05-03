package week2;

public class RandomWalker {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        System.out.println("(" + x + "," + y + ")");
        int steps = 0;
        while (!(Math.abs(x) + Math.abs(y) == N)) {
            steps++;
            double random = Math.random();
            if (random <= 0.25) ++x;
            else if (random <= 0.50) ++y;
            else if (random <= 0.75) --x;
            else --y;
            System.out.println("(" + x + "," + y + ")");
        }
        System.out.println("steps = " + steps);
    }

}
