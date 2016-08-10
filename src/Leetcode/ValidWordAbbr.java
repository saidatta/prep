package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by vmunnangi on 8/9/16.
 */
public class ValidWordAbbr {

    String [] dict;
    HashMap<String, HashSet<String>> abbrMap = new HashMap<>();
    public ValidWordAbbr(String[] dictionary) {
        this.dict = dictionary;
        makeAbbrMap(dictionary);
    }

    public void makeAbbrMap(String [] dictionary) {
        //abbrMap
        for(String word : dictionary) {
            String ab = getAbbr(word);
            if(abbrMap.containsKey(ab)) {
                abbrMap.get(ab).add(word);
            } else {
                HashSet al = new HashSet();
                al.add(word);
                this.abbrMap.put(ab, al);
            }
        }
    }

    public boolean isUnique(String word) {
        String abbr = getAbbr(word);
        if(abbrMap.containsKey(abbr) && !abbrMap.get(abbr).contains(word)) {
            return false;
        }
        if(abbrMap.containsKey(abbr) && abbrMap.get(abbr).size() > 1) {
            return false;
        }
        return true;
    }

    private String getAbbr(String word) {
        if(word.isEmpty()) {
            return "";
        }

        return ""+word.charAt(0)+(word.length() -2)+word.charAt(word.length()-1);
    }

}
