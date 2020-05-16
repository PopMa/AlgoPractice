package LeetCode.DFS.Pid93复原IP地址;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 15:02
 */
public class Solution {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
//        int level = 1;
        List<String> tmp = null;
        dfs(s, 0, 1, tmp);
        return res;
    }

    public void dfs(String str, int index, int level, List<String> tmp) {
        if (level == 5 || index == str.length() - 1) {

            return;
        }
    }
}
