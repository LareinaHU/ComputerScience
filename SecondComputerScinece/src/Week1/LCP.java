package Week1;

public class LCP {
    private static String lcp(String s, String t) {
        int N = Math.min(s.length(), t.length());
        String ss = "";
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                ss = s.substring(0, i);
                break;
            }
        }
        return ss;
    }

    public static String lrs(String s) {
        int N = s.length();
        String lrs = "";
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String x = lcp(s.substring(i, N), s.substring(j, N));
                if (x.length() > lrs.length()) {
                    lrs = x;
                    break;
                }

            }
        }
        return lrs;
    }

    public static void main(String[] args) {
        String s = "aacaagtttacaagc";

        System.out.println(lrs(s));
//        String result = lcp(s, t);
//        System.out.println(result);

//        s = "abc";
//        t = "abc";
//        result = lcp(s, t);
//        System.out.println(result);
//
//        s = "abcd";
//        result = lcp(s, t);
//        System.out.println(result);

    }
}
