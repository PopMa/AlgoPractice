package LeetCode.NineChapter.DFS.Pid17电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 15:54
 */
public class Solution {
    String[] letters = {
            "", "", "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        dfs(digits, 0, new StringBuilder(), res);
        return res;
    }

    public void dfs(String digits, int index, StringBuilder sb, List<String> res) {
        // 1. 截止条件:digits遍历结束
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        // 遍历候选节点
        for (char c: letters[digits.charAt(index) - '0'].toCharArray()){
            sb.append(c);
            dfs(digits, index+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                solution.letters.length
        );
    }

}
