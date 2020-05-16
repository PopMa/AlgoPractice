package LeetCode;

/**
 * created by popma
 * created time: 2020/4/29, 15:02
 * https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/
 */
public class Pid9_回文数 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int newNum = 0;
        while (x > newNum) {
            newNum = x % 10 + newNum * 10;
            x /= 10;
        }
        return x == newNum || newNum / 10 == x;
    }
}
