package week2;

import edu.princeton.cs.algs4.StdIn;

public class StrawStack {
    private String[] a;
    private int N = 0;

    public StrawStack(int max) {
        a = new String[max];
    }

    public boolean isEmpty() {
        return (N == 0);
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public int size() {
        return N;
    }

    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
        int max = Integer.parseInt(args[0]);
        StrawStack stack = new StrawStack(max);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (item.equals("-")) {
                System.out.println(stack.pop());
            } else
                stack.push(item);
        }
        System.out.println();
    }
}
