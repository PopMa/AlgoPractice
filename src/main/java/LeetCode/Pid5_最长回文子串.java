package LeetCode;

/**
 * created by popma
 * created time: 2020/4/29, 16:26
 */
public class Pid5_最长回文子串 {
    public String longestPalindrome(String s) {
        String res = new String();
        for (int i = 0; i < s.length(); i++) {
            // 以s[i]为中心的最长回文子串
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    private String palindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
