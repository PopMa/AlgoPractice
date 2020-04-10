package LeetCode.NineChapter.Ch1二分查找.Pid153寻找旋转排序数组中的最小值;

/**
 * created by popma
 * created time: 2019/12/29, 7:58 下午
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 请找出其中最小的元素。
 * <p>
 * 你可以假设数组中不存在重复元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
// 暴力找最小O(n)
// 先排序再找最小O(nlogn)
// 这题选用二分查找O(logn)
// 45123
// OOXXX
// 找最小的X(first position<=last number)
public class Solution {
    public static int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        int target = nums[end];
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;
            } else if (nums[mid] > target) {
                start = mid;
            }
        }
        if (nums[start] <= target) return nums[start];
        if (nums[end] <= target) return nums[end];
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
