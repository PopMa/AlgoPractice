package LeetCode.动态规划;

/**
 * created by popma
 * created time: 2020/5/1, 13:48
 * 在子串 s[i..j] 中，最长回文子序列的长度为 dp[i][j]。
 * 找状态转移需要归纳思维，说白了就是如何从已知的结果推出未知的部分，这样定义容易归纳，容易发现状态转移关系。
 * if (s[i] == s[j])
 * // 它俩一定在最长回文子序列中
 * dp[i][j] = dp[i + 1][j - 1] + 2;
 * else
 * // s[i+1..j] 和 s[i..j-1] 谁的回文子序列更长？
 * dp[i][j] = max(dp[i + 1][j], dp[i][j - 1]);
 */
public class Pid516_最长回文子序列 {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        // 初始化dp
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][len - 1];
    }
}
