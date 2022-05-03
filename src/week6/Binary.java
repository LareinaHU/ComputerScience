package week6;

public class Binary {
    public static String convert(int i){
        if(i==1) return "1";
        return convert(i/2)+i%2;
    }
    public static String hh(int i){

            return "hhh"+i;

    }

    public static void main(String[] args) {
        hh(5);
        System.out.println(hh(5));
        System.out.println(convert(11));
    }
}
