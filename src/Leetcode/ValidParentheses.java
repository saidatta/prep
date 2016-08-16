package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 8/12/16.
 */
public class ValidParentheses {

    Stack<Character> cache = new Stack<>();

    public boolean isValid(String s) {
        cache.push(s.charAt(0));
        for(int i = 1;i<s.length();i++) {
            if(cache.empty()) {
                return false;
            }

            char prev = (cache.empty()) ? Character.MIN_VALUE : cache.peek();

            boolean paren = (prev == '(' && s.charAt(i) == ')');
            boolean curly = (prev == '{' && s.charAt(i) == '}');
            boolean square = (prev == '[' && s.charAt(i) == ']');
            if(paren || curly || square) {
                cache.pop();
            } else if(s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '{' || s.charAt(i)=='}' || s.charAt(i) == '[' || s.charAt(i) == ']') {
                cache.push(s.charAt(i));
            }
        }

        return cache.empty();
    }

}
