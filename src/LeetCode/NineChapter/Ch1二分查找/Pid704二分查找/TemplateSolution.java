package LeetCode.NineChapter.Ch1二分查找.Pid704二分查找;

/**
 * created by popma
 * created time: 2019/12/28, 11:35 下午
 */
// 二分查找的模板
public class TemplateSolution {
    public static int searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        // 当start和end左右并列，循环结束了
        // while 缩小范围
        while (start + 1 < end) { // when start+1=end, loop stop
            int mid = start + (end - start) / 2; // mid=(start+end)/2可能会int越界
            if (nums[mid] == target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else if (nums[mid] > target){
                end = mid;
            }
        }
        // 找target位置
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;
    }

    public static void main(String[] args) {
        int[] result = new int[]{1, 2};
        System.out.println(searchRange(result, 2));
    }
}
