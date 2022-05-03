package week6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Reves4Hanoi {
//
//    public static void print(int a,String A, String C){
//        System.out.println("Move disc " + a + " from " + A + " to " + C);
//    }
//

    public static void reves(int n, String A, String B, String C, String D) {
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
      //  System.out.println(k);
        if (n == 0) return;
        if (n == 1) System.out.println("Move disc " + n + " from " + A + " to " + D);
        else {
            reves(k, A, C, D, B);
            hanoi(n - k,k, A, C, D);
            reves(k, B, A, C, D);
        }
    }

    public static void hanoi(int a, int b, String A, String B, String C) {
        if (a == 0) return;
        hanoi(a - 1,b, A, C, B);
      //  print(a+b,A,C);
        hanoi(a - 1,b, B, A, C);
    }

    public static void main(String[] args) {
        int n = 5;
        reves(n, "A", "B", "C", "D");
    }
}