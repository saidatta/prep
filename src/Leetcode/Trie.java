package Leetcode;

import java.util.HashMap;

/**
 * Created by vmunnangi on 6/24/16.
 */
public class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;

        for(int i = 0;i<word.length(); i++) {
            char c = word.charAt(i);

            TrieNode tn1 = new TrieNode(c);
            children.put(c, tn1);
        }
    }
}
