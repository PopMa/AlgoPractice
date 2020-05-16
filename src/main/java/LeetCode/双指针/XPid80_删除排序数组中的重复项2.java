package LeetCode.双指针;

/**
 * created by popma
 * created time: 2020/4/28, 20:10
 * 快慢指针
 * 因为对于数组,不要频繁在中间增删,移动到末端再删除.
 * 绕晕了
 */
public class XPid80_删除排序数组中的重复项2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int j = 1, count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }
}
