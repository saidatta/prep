package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 6/13/16.
 */
public class ThreeSum {
        public static void main (String [] args) {
            int [] nums = {-1, 0, 1, 2, -1, -4};
            System.out.println(threeSum(nums));
        }

        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();

            HashMap<Integer,Integer> kk = new HashMap<>();
            for(int b = 0; b< nums.length;b++) {
                kk.put(nums[b], b);
            }

            for(int a = 0; a <nums.length;a++) {
                for(int c = a+1; c <nums.length; c++) {
                    List<Integer> temp = new ArrayList<>();
                    int b = -nums[a]-nums[c];
                    if(kk.containsKey(b) && kk.get(b) != a && kk.get(b) != c ) {
                        temp.add(nums[a]);
                        temp.add(b);
                        temp.add(nums[c]);
                        ans.add(temp);
                    }
                }
            }

            return ans;
        }
}
