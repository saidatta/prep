package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 8/11/16.
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0) {
            return new ArrayList<Interval>();
        }

        Collections.sort(intervals, (o1, o2) -> {
            int start1 = o1.start;
            int start2 = o2.start;

            int e1 = o1.end;
            int e2 = o2.end;
            if(start1 > start2) {
                return 1;
            } else if(start1 < start2) {
                return -1;
            } else {
                if(e1 > e2) {
                    return 1;
                } else if(e1 < e2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });


        List<Interval> ans = new ArrayList<>();
        int min = intervals.get(0).start, max = intervals.get(0).end;

        if(ans.size() == 1) {
            // if only one interval, then we dont need the comparision.
            Interval startInterval = new Interval(min, max);
            ans.add(startInterval);
            return ans;
        }
        for(int i = 1; i < intervals.size(); i++ ) {
            int t1 = intervals.get(i).start;
            int t2 = intervals.get(i).end;

            if(max >= t1) {
                //updating the max to point to the current max because both have been merged.
                if( max < t2 )
                    max = t2;
            } else {
                //creating the new merged Interval.
                Interval intervalC = new Interval(min, max);
                ans.add(intervalC);
                min = t1;
                max = t2;
            }
        }

        ans.add(new Interval(min, max));
        return ans;

    }




    public class Interval {
             int start;
             int end;
             Interval() { start = 0; end = 0; }
             Interval(int s, int e) { start = s; end = e; }
    }
}
