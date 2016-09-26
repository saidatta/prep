package BookInterviews;

/**
 * Created by venkatamunnangi on 8/23/16.
 */
public class Mainer {

    public static void main(String [] args) {
        testCheckPermutation();
    }

    public static void testCheckPermutation() {
        CheckPermutation cp = new CheckPermutation();
        System.out.println(cp.checkPermutation("",""));
        System.out.println(cp.checkPermutation("a","a"));
        System.out.println(cp.checkPermutation("aa","aa"));
        System.out.println(cp.checkPermutation("ab","ab"));
        System.out.println(cp.checkPermutation("abc","cab"));
        System.out.println(cp.checkPermutation("abcdefgh","bacedfgh"));
        System.out.println(cp.checkPermutation("abaweawe","ba"));
        System.out.println(cp.checkPermutation("aaweaweb",""));
        System.out.println(cp.checkPermutation("","baweawea"));
    }

    public static void testPercentSpace() {
        PercentSpace ps = new PercentSpace();
    }


}
