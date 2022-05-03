package week3;

public class Minesweeper {
    public static void main(String[] args) {
//        StdRandom
//         int m = Integer.parseInt(args[0]);
//         int n = Integer.parseInt(args[1]);
//         int k = Integer.parseInt(args[2]);
       int m = 10, n = 10, k = 10;
        char[][] map = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = '0';
            }
        }

        // place * on matrix
        while (k > 0) {
            double rand1 = Math.random();
            double rand2 = Math.random();

            // nextInt select between [0, m)
            int r = (int) (rand1 * (m));
            // nextInt select between [0, n)
            int c = (int) (rand2 * (n));
            // if it's not a mine, put mine on it.
            if (map[r][c] != '*') {
                map[r][c] = '*';
                k--;
            }
        }

        // we placed all the k, now we put up number
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*') {
                    // found mine, plus around
                    for (int kk = i - 1; kk <= i + 1; kk++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            // check position valid
                            if (kk >= 0 && kk < m && l >= 0 && l < n && map[kk][l] != '*') {
                                map[kk][l]++;
                            }
                        }
                    }
                }
            }
        }

        // print matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

