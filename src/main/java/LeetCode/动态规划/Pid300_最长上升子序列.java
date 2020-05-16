package LeetCode.动态规划;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2020/5/1, 08:55
 * dp https://gitee.com/popma/fucking-algorithm/blob/master/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92%E7%B3%BB%E5%88%97/%E5%AD%90%E5%BA%8F%E5%88%97%E9%97%AE%E9%A2%98%E6%A8%A1%E6%9D%BF.md
 * 在子数组 array[0..i] 中，我们要求的子序列（最长递增子序列）的长度是 dp[i]。
 */
public class Pid300_最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length]; // dp
        Arrays.fill(dp, 1); // 填充为1

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) { //dp变化的关键
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(dp[i], res);
        }

        return res;
    }
}
