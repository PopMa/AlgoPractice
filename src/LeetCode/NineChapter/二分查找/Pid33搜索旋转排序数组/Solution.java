package LeetCode.NineChapter.二分查找.Pid33搜索旋转排序数组;

/**
 * created by popma
 * created time: 2019/12/29, 8:42 下午
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * <p>
 * 你可以假设数组中不存在重复的元素。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
// challenge: 一个二分
// 比较难
// 区别于传统的二分，这题和两个数字比较
public class Solution {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
//        int startNum = nums[0];
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= nums[start]) { //在左侧
                if (nums[mid] >= target && nums[start] <= target) { // 和两个数比较
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                if (nums[mid] <= target && nums[end] >= target) { //和两个数比较
                    start = mid;
                } else {
                    end = mid;
                }
            }

        }
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5};
        System.out.println(search(nums, 4));
    }
}

