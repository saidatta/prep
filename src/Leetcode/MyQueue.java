package Leetcode;

import java.util.Stack;

/**
 * Created by vmunnangi on 7/14/16.
 */
class MyQueue {
    Stack<Integer> fs = new Stack<>();
    Stack<Integer> rs = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        while(!rs.isEmpty()) {
            fs.push(rs.pop());
        }
        fs.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!fs.isEmpty()) {
            rs.push(fs.pop());
        }
        rs.pop();
    }

    // Get the front element.
    public int peek() {
        while(!fs.isEmpty()) {
            rs.push(fs.pop());
        }
        rs.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return fs.empty() && rs.empty();
    }
}