package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vmunnangi on 8/10/16.
 */
public class PerfectSquares {

    HashMap<Integer, Integer> dict = new HashMap<>();
    public int numSquares_old(int n) {
        if(n <= 3) {
            return n;
        }
        if(dict.containsKey(n)) {
            return dict.get(n);
        }
        int res = n;
        for(int i = 1; n - i*i >=0 ; i++) {
            res = Math.min(res, 1 + numSquares(n - i*i));
            dict.put(i, res);
        }
        return res;
    }

    public int numSquares(int n) {
        //creating a new table
        int [] dp = new int[n+1];

        int x = n < 3 ? n : 3;

        for(int i = 0;i<=x;i++) {
            dp[i] = i;
        }

        //calculating min square from 4 to n.
        for(int i = 4;i<=n;i++) {
            //starting point to be high enough for min.
            dp[i] = i;
            for(int j = 1;j<=i;j++) {
                int temp = j*j;
                if(i - temp < 0) {
                    break;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i-temp]);
            }
        }
        return dp[n];
    }
}
