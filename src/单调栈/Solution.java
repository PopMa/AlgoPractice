package 单调栈;

import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;
import java.util.Stack;

/**
 * created by popma
 * created time: 2020/3/29, 09:32
 * 给你一个数组 [2,1,2,4,3]，你返回数组 [4,2,4,-1,-1]。
 * <p>
 * 解释：第一个 2 后面比 2 大的数是 4; 1 后面比 1 大的数是 2；第二个 2 后面比 2 大的数是 4; 4 后面没有比 4 大的数，填 -1；3 后面没有比 3 大的数，填 -1。
 */
public class Solution {
    public static int[] nextGreaterElement(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i > -1; i--) { // 倒着往栈里放
            while (!s.empty() && nums[i] >= s.peek()) { // 判定个子高矮
                s.pop();
            }
            ans[i] = s.empty() ? -1 : s.peek();
            s.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 2, 4, 3};
        System.out.println(Arrays.toString(nextGreaterElement(nums)));
    }
}
