package Week1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WhiteFilter {
    public static int search(String key, String[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(key)==0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // In in = new In("34534 3rtw rtwrt tytt");
        //  String [] words = in.readAllStrings();
        String[] words = {"abcd", "bcde", "cdef", "efgh", "ghij"};
        while (true) {
            String key = StdIn.readString();
            if (search(key, words) != -1) StdOut.print(key);
            else StdOut.print("null");
            break;
        }
    }
}
