package LeetCode.双指针.Pid524通过删除字母匹配到字典里最长单词;

import java.util.List;

/**
 * created by popma
 * created time: 2019/12/22, 10:25 下午
 */
public class Solution1 {
    // judge substr
    private boolean isSubStr(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public String findLongestWord(String s, List<String> d) {
        String res = "";
        for (int i = 0; i < d.size(); i++) {
            String target = d.get(i);
            // 返回长度最长且字典顺序最小的字符串
            if (res.length() > target.length() || (res.length() == target.length() && res.compareTo(target) < 0)) continue;
            if (isSubStr(s, target)) res = target;
        }
        return res;
    }
}
