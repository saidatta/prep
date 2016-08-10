package Leetcode;

/**
 * Created by vmunnangi on 8/9/16.
 */
public class Mainer {
    public static void main(String[] args) {
        String [] dict = {"deer" ,"door" ,"cake" ,"card"};
        ValidWordAbbr abr = new ValidWordAbbr(dict);
        System.out.println(abr.isUnique("dear"));
        System.out.println(abr.isUnique("door"));
        System.out.println(abr.isUnique("cart"));
        System.out.println(abr.isUnique("cake"));

    }
}
