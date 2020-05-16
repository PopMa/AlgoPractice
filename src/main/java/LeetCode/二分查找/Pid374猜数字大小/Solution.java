package LeetCode.二分查找.Pid374猜数字大小;

/**
 * created by popma
 * created time: 2019/12/29, 3:37 下午
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/guess-number-higher-or-lower
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class Solution {
    private static int pick = 2;
    private static int n = 2;

    public static int guessNumber(int n) {
        int low = 1,high = n;
        while (low+1<high){
            int mid = low+(high-low)/2;
            int score = guess(mid,pick);
            if (score == 0) high=mid;
            else if (score==-1) high=mid;
            else low=mid;
        }
        // [1,2] pick=2
        if (guess(low,pick) == 0) return low;
        if (guess(high,pick) == 0) return high;
        return -1;
    }

    private static int guess(int mid,int pick) {
        if (mid == pick) return 0;
        else if (mid > pick) return -1;
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(2));
    }
}
