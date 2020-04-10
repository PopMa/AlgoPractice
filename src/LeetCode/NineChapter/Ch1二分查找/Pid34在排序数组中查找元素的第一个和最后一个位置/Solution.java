package LeetCode.NineChapter.Ch1二分查找.Pid34在排序数组中查找元素的第一个和最后一个位置;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/28, 11:33 下午
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//O(logn) 就考虑二分查找
public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return result;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                start = mid; // 找结束位置，可能在mid之后
            } else if (nums[mid] < target) {
                start = mid;
            } else if (nums[mid] > target) {
                end = mid;
            }
        }
        if (nums[start] == target) result[1] = start;
        if (nums[end] == target) result[1] = end;


        start = 0;
        end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid; // 找开始位置，可能在mid之前
            } else if (nums[mid] < target) {
                start = mid;
            } else if (nums[mid] > target) {
                end = mid;
            }
        }
        if (nums[end] == target) result[0] = end;
        if (nums[start] == target) result[0] = start;
        return result;
    }

    public static void main(String[] args) {
        int[] result = new int[]{2, 2};
        System.out.println(Arrays.toString(searchRange(result, 2)));
    }
}
