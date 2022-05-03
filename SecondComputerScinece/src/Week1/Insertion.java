package Week1;

public class Insertion {
    public static void sort(String[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1].compareTo(a[j]) > 0) {
                    exchange(a, j - 1, j);
                }

            }
        }
    }
    private static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String [] s = {"cRYE","rtrtyw","teret","qrrew","aa"};
        sort(s);
        for (String s1 : s) {
            System.out.println(s1);
        }

        String a = s[1];
        char []aa = a.toCharArray();
        for (char c : aa) {
            System.out.println(c);
        }
        System.out.println(aa[0]- aa[1]);


    }
}
