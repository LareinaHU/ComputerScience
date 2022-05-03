package week7;

public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) count++;
        }
        return count;
    }

    public static int[] generate(int n, long k) {
        int largest = n - 1;
        int[] result = new int[n];
//        Arrays.fill(result, -1);
        while (k > 0) {
            if (k <= largest) {
                result[(int) (result.length - k - 1)] = largest;
            } else {
                result[result.length - largest - 1] = largest;

            }
            k -= largest;
            largest--;
        }

        for (int current = 0, i = 0; current <= largest && i < result.length; i++) {
            if (result[i] > 0) {
                continue;
            }
            result[i] = current;
            current++;
        }
        return result;
    }


    public static void main(String[] args) {
        Long k = 23l;
        int n = 10;
//        int n = Integer.parseInt(args[0]);
//        Long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


//        final String errorMessage1 = "Number of inversions k is too big for permutation length n";
//        if ((k > n * (n - 1) / 2) || (k < 0)) {
//            throw new IllegalArgumentException(errorMessage1);