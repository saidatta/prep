package Leetcode;

import java.util.Arrays;

/**
 *
 * Created by vmunnangi on 6/13/16.
 */
public class TwoSum {
    public static void main(String [] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        int [] nums2 = {2};
        target = 2;
        System.out.println(Arrays.toString(twoSum(nums2, target)));
        int [] nums3 = {-1,-2,0,4,-1};
        target = 0;
        System.out.println(Arrays.toString(twoSum(nums3, target)));
        int [] nums4 = {1,1,0,0,100};
        target = 100;
        System.out.println(Arrays.toString(twoSum(nums4, target)));
    }

    public static int [] twoSum(int [] nums, int target) {

        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    int [] ans = {nums[i],nums[j]};
                    return ans;
                }
            }
        }

        return null;
    }
}
