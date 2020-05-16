package LeetCode.二分查找;

/**
 * created by popma
 * created time: 2019/12/30, 3:55 下午
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Pid35_搜索插入位置 {
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                return mid;
            }
        }
        // target 会落在start和end的几个位置上
        if (nums[start] < target && target < nums[end]) return end;
        else if (target <= nums[start]) return start;
        else if (target > nums[end]) return end + 1;
        else if (target == nums[end]) return end;
        else return 0;

//        return end;
//        if (nums[start] == target) return start;
//        if (nums[end] == target) return end;
//        return 0;
//        int index = 0;
//        for (int i = 0;i<nums.length;i++){
//            if (target>nums[i]) index++;
//            else break;
//        }
//        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
//        System.out.println(searchInsert(nums,5));
//        System.out.println(searchInsert(nums,1));
//        System.out.println(searchInsert(nums,3));
//        System.out.println(searchInsert(nums,6));
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 7));
        System.out.println(searchInsert(nums, 0));
    }
}
