package 每日一题202005;

import java.util.Stack;

/**
 * created by popma
 * created time: 2020/5/12, 09:06
 */
public class Pid155_最小栈 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();   // --> 返回 -3.
        minStack.pop();
        minStack.top();     // --> 返回 0.
        minStack.getMin();   // --> 返回 -2.
    }
}

class MinStack {
    Stack<Integer> data;
    Stack<Integer> min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        data.add(x);
        if (min.isEmpty() || min.peek() >= x) {
            min.add(x); // 用辅助栈保存当前高度的最小值
        } else {
            min.add(min.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
            min.pop();
        }
    }

    public int top() {
        if (!data.isEmpty()) {
            return data.peek();
        } else {
            throw new RuntimeException("stack is empty");
        }
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        } else {
            throw new RuntimeException("stack is empty");
        }
    }
}