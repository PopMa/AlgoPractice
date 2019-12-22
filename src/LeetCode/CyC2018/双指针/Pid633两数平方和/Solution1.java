package LeetCode.CyC2018.双指针.Pid633两数平方和;

/**
 * created by popma
 * created time: 2019/12/22, 12:43 上午
 */
// 双指针 double
public class Solution1 {
    public boolean judgeSquareSum(int c) {
        int low = 0, high = (int)Math.sqrt(c)-1;
        while (low <= high){
            int sum = low*low+high*high;
            if (sum== c) return true;
            else if (sum<c) low++;
            else if (sum>c) high--;
        }
        return false;
    }
}
