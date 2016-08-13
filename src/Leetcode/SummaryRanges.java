package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 8/10/16.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return ans;
        }

        if(nums.length == 1) {
            ans.add(makeString(nums[0], nums[0]));
            return ans;
        }

        int min = nums[0];
        int context = 0;
        for(int i = 1; i<nums.length;i++) {
            if(nums[i] - nums[i-1] != 1) {
                ans.add(makeString(min, nums[i-1]));
                min = nums[i];
                context = 0;
            }
            context++;
        }
        if(context > 0) {
            ans.add(makeString(min, nums[nums.length-1]));
        }

        return ans;
    }

    private String makeString(int n1, int n2) {
        if(n1 == n2) {
            return ""+n1;
        }
        return ""+n1+"->"+n2;
    }

}
