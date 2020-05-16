package LeetCode.二分查找;

/**
 * created by popma
 * created time: 2019/12/29, 7:58 下午
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 请找出其中最小的元素。
 * <p>
 * 注意数组中可能存在重复的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
// 暴力找最小O(n)
// 先排序再找最小O(nlogn)
// 这题选用二分查找O(logn)
// 45123
// OOXXX
// 找最小的X(first position<=last number)
public class Pid154_寻找旋转排序数组中的最小值2 {
    public static int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end -= 1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 1, 3};
        System.out.println(findMin(nums));
    }
}
