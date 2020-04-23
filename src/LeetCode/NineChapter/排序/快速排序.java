package LeetCode.NineChapter.排序;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/1/12, 11:38
 */
// 先大排序，再分开递归排序
// Index的比较都<=/>= Value的比较都>/<
public class 快速排序 {

    public List<Integer> sortIntegers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        quickSort(nums, 0, nums.length - 1);
        List<Integer> results = new ArrayList<Integer>();
        for (int i : nums) {
            results.add(i);
        }
        return results;
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start, right = end; // double pointer
        // 1. pivot : value, not index
        int pivot = nums[(start + end) / 2]; // 标杆
        // 2. left <= right not left < right，否则溢出
        // === partition ===
        while (left <= right) {
            // 3. nums[left] < pivot 否则溢出
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(nums, start, right); // left>right
        quickSort(nums, left, end);
    }
}
