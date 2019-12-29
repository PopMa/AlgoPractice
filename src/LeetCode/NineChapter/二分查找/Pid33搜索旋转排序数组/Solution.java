package LeetCode.NineChapter.二分查找.Pid33搜索旋转排序数组;

/**
 * created by popma
 * created time: 2019/12/29, 8:42 下午
 */
public class Solution {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                end = mid;
            } else if (nums[mid] > target) {
                start = mid;
            }
        }
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(search(nums, 2));
    }
}

