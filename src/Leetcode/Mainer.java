package Leetcode;

/**
 * Created by vmunnangi on 8/9/16.
 */
public class Mainer {
    public static void main(String[] args) {
        //getValidAbbr();
        //getMissingRanges();
        //getSummaryRanges();
        getPerfectSquares();
    }

    public static void getPerfectSquares(){
        PerfectSquares ps = new PerfectSquares();
        System.out.println(ps.numSquares(12));
        System.out.println(ps.numSquares(2));
        System.out.println(ps.numSquares(1));
        System.out.println(ps.numSquares(25));
        System.out.println(ps.numSquares(27));
    }

    public static void getValidAbbr(){
        String [] dict = {"deer" ,"door" ,"cake" ,"card"};
        ValidWordAbbr abr = new ValidWordAbbr(dict);
        System.out.println(abr.isUnique("dear"));
        System.out.println(abr.isUnique("door"));
        System.out.println(abr.isUnique("cart"));
        System.out.println(abr.isUnique("cake"));
    }

    public static void getMissingRanges(){
        MissingRanges obj = new MissingRanges();
        int [] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        System.out.println(obj.findMissingRanges(nums, lower, upper));

        int [] nums2 = {};
        int lower2 = 1;
        int upper2 = 1;
        System.out.println(obj.findMissingRanges(nums2, lower2, upper2));

        int [] nums3 = {-1};
        int lower3 = -1;
        int upper3 = -1;
        System.out.println(obj.findMissingRanges(nums3, lower3, upper3));

        int [] nums4 = {0,1};
        int lower4 = 0;
        int upper4 = 1;
        System.out.println(obj.findMissingRanges(nums4, lower4, upper4));
    }

    public static void getSummaryRanges() {
        SummaryRanges obj = new SummaryRanges();
        int [] nums = {0, 1, 3, 50, 75};
        System.out.println(obj.summaryRanges(nums));

        int [] nums2 = {};
        System.out.println(obj.summaryRanges(nums2));

        int [] nums3 = {-1};
        System.out.println(obj.summaryRanges(nums3));

        int [] nums4 = {0,1};
        System.out.println(obj.summaryRanges(nums4));

        int [] nums5 = {-2,-1,0};
        System.out.println(obj.summaryRanges(nums5));

        int [] nums6 = {-2,-1,0,1,2};
        System.out.println(obj.summaryRanges(nums6));

        int [] nums7 = {0,1,2,3,10,15,17,18,19};
        System.out.println(obj.summaryRanges(nums7));

        int [] nums8 = {0,1,100};
        System.out.println(obj.summaryRanges(nums8));

        int [] nums9 = {0,3};
        System.out.println(obj.summaryRanges(nums9));

        int [] nums10 = {-2147483648,-2147483647,2147483647};
        System.out.println(obj.summaryRanges(nums10));

        int [] nums11 = {0,1,3};
        System.out.println(obj.summaryRanges(nums11));

    }
}
