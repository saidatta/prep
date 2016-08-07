package Leetcode;

/**
 * Created by vmunnangi on 8/1/16.
 */
public class OnePlus {

    public static void main(String [] args){

    }


    class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;
            int [] ans = new int[digits.length+1];
            for(int i = digits.length - 1 ;i>= 0 ;i--) {
                int x = digits[i] + carry;
                digits[i] = x%10;
                carry = x /10;
            }

            if(carry  == 1) {
                ans[0] = carry;
                for(int i = 0 ;i< digits.length ;i++) {
                    ans[i+1] = digits[i];
                }
                return ans;
            }
            return digits;
        }
    }

}
