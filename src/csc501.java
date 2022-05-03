import java.util.*;

public class csc501 {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        Set<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(6);
        System.out.println(A);
        System.out.println(B);

        Set<Integer> Union = new HashSet<Integer>(A);
        Union.addAll(B);
        System.out.println(Union);

        Set<Integer> Intersection = new HashSet<Integer>(A);
        Intersection.retainAll(B);
        System.out.println(Intersection);

        Set<Integer> Difference = new HashSet<Integer>(A);
        Difference.removeAll(B);
        System.out.println(Difference);

        Set<Integer> Complement = new HashSet<Integer>(A);
        int n = 4;
        System.out.println("Is " + n + " a element of A'? "
                + isinComplement(Complement, n));
    }
    public static boolean isinComplement(Set A, int element) {
        return !A.contains(element);
    }
}

//    public static void main(String[] args) {
//        Set<Integer> a = new HashSet<Integer>();
//        a.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
//        Set<Integer> b = new HashSet<Integer>();
//        b.addAll(Arrays.asList(new Integer[]{4, 5, 6, 7, 8}));
//
//        // To find union
//        Set<Integer> union = new HashSet<Integer>(a);
//        union.addAll(b);
//        System.out.print("Union of the two Set" + union);
//        System.out.println(union);
//
//        // To find intersection
//        Set<Integer> intersection = new HashSet<Integer>(a);
//        intersection.retainAll(b);
//        System.out.print("Intersection of the two Set");
//        System.out.println(intersection);
//
//        // To find the symmetric difference
//        Set<Integer> difference = new HashSet<Integer>(a);
//        difference.removeAll(b);
//        System.out.print("Difference of the two Set");
//        System.out.println(difference);
//    }


//    public static void main(String[] args) {
//        int[] A = {1, 2, 3};
//        int[] B = {6, 7, 8};
//        System.out.print("The Cartesian product of A and B is: A X B = {");
//        List<String> ss = new ArrayList<>();
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < B.length; j++) {
//                ss.add("(" + A[i] + "," + B[j] + ")");
//            }
//        }
//        System.out.print(String.join(", ", ss));
//        System.out.println("}");
//    }








