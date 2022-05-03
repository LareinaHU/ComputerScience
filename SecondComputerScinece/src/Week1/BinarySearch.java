package Week1;

public class BinarySearch {
    public static int search(String key, String[] a) {
        return search(key, a, 0, a.length);
    }

    public static int search(String key, String[] a, int lo, int hi) {
        if (hi <= lo) return -1;
        int mid = (hi - lo) / 2;
        System.out.println(a[mid]);
        int cmp = a[mid].compareTo(key);
        if (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid, hi);
        else return mid;

    }

    public static void main(String[] args) {
        String [] aa = {"ass","ber","cra","dryry","eqw",};

        String key = "ass";
        search(key,aa);

    }
}

