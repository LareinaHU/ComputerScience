package week3;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.StdIn;

public class SymbolTable<Key extends Comparable<Key>, Value> {

    public static void main(String[] args) {
        BST<String, Integer> st = new BST<String, Integer>();
        while (StdIn.hasNextLine())
            st.put(StdIn.readLine(), 0);
        for(String s:st.keys()){
            System.out.println(s);
        }
    }


}
