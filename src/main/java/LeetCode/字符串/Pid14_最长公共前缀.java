package LeetCode.字符串;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2020/5/1, 12:58
 */
public class Pid14_最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int len = strs.length;
        for (int i = 0; i < len; i++) {
            if (strs[i].length() == 0 || strs[i] == null) {
                return "";
            }
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"abe2", "ab", "ae", "a2b"};
        System.out.println(longestCommonPrefix(strs));
    }
}
