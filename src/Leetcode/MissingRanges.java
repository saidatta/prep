package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 8/9/16.
 */
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        ArrayList<String> ans = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            if(lower == upper) {
                ans.add(""+lower);
            } else {
                ans.add("" + lower + "->" + upper);
            }
            return ans;
        }

        int size = nums.length;

        if(nums[0] - lower >= 1) {
            ans.add(makeString(lower,nums[0]-1));
        }

        if(nums[0] == upper) {
            return ans;
        }


        for(int i = 1;i< size ; i++) {
            int relativeLower = nums[i-1];
            int relativeUpper = nums[i];
            if (nums[i] - nums[i - 1] > 1) {
                ans.add(makeString(relativeLower + 1, relativeUpper - 1));
            }
        }

        if(upper - nums[size-1] > 0) {
            ans.add(makeString(nums[size-1]+1, upper));
        }

        return ans;
    }

    private String makeString(int x, int y) {
        if(x == y) {
            return ""+x;
        }
        return ""+x+"->"+y;
    }
}
