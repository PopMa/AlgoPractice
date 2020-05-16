package LeetCode.排序.Pid215数组中的第K个最大元素;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/23, 3:23 下午
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/description/
 */
// Kth Element
public class Solution1 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
