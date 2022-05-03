public class Gambler {


    public static void main(String[] args) {
//        int stake = Integer.parseInt(args[0]);
//        int goal = Integer.parseInt(args[1]);
//        int trials = Integer.parseInt(args[2]);
        int stake = 100;
        int goal = 1000;
        int trials = 50;

        int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal)
                if (Math.random() < 0.5) cash++;
                else cash--;
            if (cash == goal) wins++;
        }
        StdOut.print(wins + " wins of " + trials);
    }
}

