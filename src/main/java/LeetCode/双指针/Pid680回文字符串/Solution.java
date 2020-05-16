package LeetCode.双指针.Pid680回文字符串;

import java.util.Scanner;

/**
 * created by popma
 * created time: 2019/12/22, 12:51 下午
 */

/***
 * 假设我们想知道 s[i],s[i+1],...,s[j] 是否形成回文。如果 i >= j，就结束判断。
 * 如果 s[i]=s[j]，那么我们可以取 i++;j--。否则，回文必须是 s[i+1], s[i+2], ..., s[j] 或 s[i], s[i+1], ..., s[j-1] 这两种情况。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii/solution/yan-zheng-hui-wen-zi-fu-chuan-ii-by-leetcode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution {
    // 普通的验证是否是回文字符串
    public static boolean commonValidPalindrome(String s,int low,int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) return false;
            low += 1;
            high -= 1;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)){
                return commonValidPalindrome(s,i+1,j) || commonValidPalindrome(s,i,j-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = new String();
            string = sc.next();
            if (validPalindrome(string)) System.out.printf("yes");
            else System.out.printf("no");
        }
    }
}
