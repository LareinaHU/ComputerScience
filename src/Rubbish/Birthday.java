package Rubbish;

import java.util.Arrays;

public class Birthday {
    public static void main(String[] args) {
        double times = 1000000;
        int days = 31;
        // there's person has this birthday in current experiment
        boolean[] hit = new boolean [days];
        // in total, how many times reach conflict at Nth people
        double [] peopleCount = new double[days + 1];
        for (int currentTimes = 0; currentTimes < times; currentTimes++) {
            for (int people = 0; ; people++) {
                int birthday = (int)(Math.random() * days);
                if (hit[birthday]) {
                    peopleCount[people]++;
                    break;
                } else {
                    hit[birthday] = true;
                }
            }
            Arrays.fill(hit, false);
        }

        double currentPercentage = 0;
        for (int people = 0; people <= days; people++) {
            double percentage = peopleCount[people] / times;
            currentPercentage += percentage;
            System.out.println(people + 1 + "      " + (int)peopleCount[people] + "    " + currentPercentage);
            if (currentPercentage >= 0.5) {
                return;
            }
        }
    }
}
