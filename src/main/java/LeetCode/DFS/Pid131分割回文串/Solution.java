package LeetCode.DFS.Pid131分割回文串;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/16, 22:22
 * 切割问题都是组合问题
 */
public class Solution {
    private List<List<String>> res = new ArrayList<>();

    private static boolean checkStr(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) {
            return res;
        }
        List<String> sb = new ArrayList<>();
        dfs(s, sb, 0);
        return res;
    }

    private void dfs(String s, List<String> sb, int startIndex) {
        if (startIndex == s.length()) {
            res.add(new ArrayList<String>(sb));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            String subStr = s.substring(startIndex, i + 1);
            if (!checkStr(subStr)) {
                continue;
            }
            sb.add(subStr);
            dfs(s, sb, i + 1);
            sb.remove(sb.size() - 1);
        }
    }
}
