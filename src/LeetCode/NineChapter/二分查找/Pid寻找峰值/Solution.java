package LeetCode.NineChapter.二分查找.Pid寻找峰值;

/**
 * created by popma
 * created time: 2019/12/29, 10:38 下午
 * 峰值元素是指其值大于左右相邻值的元素。
 *
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 *
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 *
 * 你可以假设 nums[-1] = nums[n] = -∞。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-peak-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static int findPeakElement(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return 0;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                start = mid;
            } else if (nums[mid] > nums[mid + 1] && nums[mid] < nums[mid - 1]) {
                end = mid;
            }else if (nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]){
                start = mid;
            } else if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
                return mid;
            }
        }
        return nums[start] > nums[end] ? start : end;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,2};
        System.out.println(findPeakElement(nums));
    }
}
