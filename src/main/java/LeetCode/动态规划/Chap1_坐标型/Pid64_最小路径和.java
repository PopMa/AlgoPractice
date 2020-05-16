package LeetCode.动态规划.Chap1_坐标型;

/**
 * created by popma
 * created time: 2020/5/7, 09:20
 */
public class Pid64_最小路径和 {
    public int minPathSum(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int res = Integer.MAX_VALUE;

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[0][0];
                    continue;
                } else if (i == 0) dp[i][j] = dp[i][j - 1] + grid[i][j];
                else if (j == 0) dp[i][j] = dp[i - 1][j] + grid[i][j];
                else dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
//                if (i > 0) {
//                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + grid[i][j]);
//                }
//                if (j > 0) {
//                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + grid[i][j]);
//                }

            }
        }
        return dp[m - 1][n - 1];
    }

    // 方法2:滚动数组优化
    // 只需要把i变为now，i-1变为old即可
    public int minPathSum2(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[2][m];
        int old = 0, now = 0;
        for (int i = 0; i < n; i++) {
            old = now;
            now = 1 - now;
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[now][j] = A[0][0];
                    continue;
                }
                dp[now][j] = Integer.MAX_VALUE;
                //来自上方
                if (i > 0) {
                    dp[now][j] = Math.min(dp[now][j], dp[old][j] + A[i][j]);
                }
                //来自左侧
                if (j > 0) {
                    dp[now][j] = Math.min(dp[now][j], dp[now][j - 1] + A[i][j]);
                }
            }
        }
        return dp[now][m - 1];
    }
}
//    来源: 0xac001d09
//    文章作者: Jerry
//    文章链接: https://jerry.zone/2019/12/02/%E5%9D%90%E6%A0%87%E5%9E%8B%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/#toc-heading-5
//    本文章著作权归作者所有，任何形式的转载都请注明出处。


