package LeetCode.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * created by popma
 * created time: 2020/3/19, 11:02
 */
public class Pid_409最长回文串 {
    public int longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> statistic = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            char c = s.charAt(i);
            statistic.put(c, statistic.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (Character c : statistic.keySet()) {
            Integer val = statistic.get(c);
            res += val / 2 * 2;
        }
        if (res < s.length()) return res + 1;
        else return res;
    }
}
