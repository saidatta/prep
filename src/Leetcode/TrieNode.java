package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 6/24/16.
 */
public class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<>();
    boolean isLeaf;

    TrieNode() {}

    TrieNode(char c) {
        this.c = c;
    }
}
