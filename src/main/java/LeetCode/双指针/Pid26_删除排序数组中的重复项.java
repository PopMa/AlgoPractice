package LeetCode.双指针;

/**
 * created by popma
 * created time: 2020/4/28, 20:10
 * 快慢指针
 * 因为对于数组,不要频繁在中间增删,移动到末端再删除.
 */
public class Pid26_删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int slow = 0, fast = 1;

        while (fast < n) {
            if (nums[fast] != nums[slow]) { // 不相等的时候 slow++
                slow++;
                // 维护 nums[0..slow] 无重复
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
