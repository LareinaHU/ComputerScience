package week2;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;


public class QEx {
    public static String[] readAllStrings() {
        Queue<String> q = new Queue<String>();
        while (!StdIn.isEmpty()) {
            q.enqueue(StdIn.readString());
        }
        int N = q.size();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            //    words[i]=q.enqueue();
            //----------mistake here!!!!
        }
        return words;
    }

    public static void main(String[] args) {
        String[] words = readAllStrings();
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
