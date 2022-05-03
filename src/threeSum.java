public class threeSum {

    // print distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
    public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }

    // return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[] ints() {
        int M = 10000;
        int N = 5000;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = StdRandom.uniform(-M, M);
        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] a = StdIn.readAllInts();
//        Stopwatch timer = new Stopwatch();
//        int count = count(a);
//        StdOut.println("elapsed time = " + timer.elapsedTime());
//        StdOut.println(count);
        int[] a = ints();
        double start = System.currentTimeMillis() / 1000.0;
        int cnt = count(a);
        double now = System.currentTimeMillis() / 1000.0;
        StdOut.printf("%d(%.0f seconds)\n", cnt, now - start);


    }
}


