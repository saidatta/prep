package Leetcode;

import java.util.*;

public class MovingAverage {

     Queue<Integer> q = new LinkedList<>();
     int pointer = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        pointer = size;
    }

    public  double next(int val) {
        double sum = 0;

        if(q.size() == pointer) {
            q.poll();
        }
        q.add(val);
        for(int i : q) {
            sum += i;
        }
        return sum/q.size();
    }
}
class mainer {
    public static void main(String [] args) {
        MovingAverage ma = new MovingAverage(4);
        System.out.println(ma.next(100));
        System.out.println(ma.next(-10));
        System.out.println(ma.next(-300));
        System.out.println(ma.next(50));
        System.out.println(ma.next(0));
    }
}