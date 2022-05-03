package week2;

import Week1.Merge;

public class suffixes {
    public static String lcp(String s, String t) {
        int N = Math.min(s.length(), t.length());
        String ss = null;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                ss = s.substring(0, i);
                break;
            }
        }
        return ss;
    }

    public static String lrs(String s){
        int N = s.length();
        String[] suffixes = new String[N];
        for(int i = 0;i<N; i++){
            suffixes[i]=s.substring(i,N);
        }
        Merge.sort(suffixes);
        String lrs ="";
        for(int i = 0; i<N-1;i++){

            String x =  lcp(suffixes[i],suffixes[i+1]);
            if(x.length()>lrs.length())lrs = x;

        }
      return lrs;
    }
}
