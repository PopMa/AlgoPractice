package LeetCode.NineChapter.Ch1二分查找.Pid189旋转数组;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/30, 11:22 下午
 */
// 三步旋转法
public class Solution {
    // 左右各自反转
    // 整体反转
    // 反转用双指针
    public static void rotate(int[] nums, int k) {
        if (nums.length == 1) return;
        int len = nums.length;
        k = k % len; // k>nums.length
        reverse(nums, 0, len - 1 - k);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

}
