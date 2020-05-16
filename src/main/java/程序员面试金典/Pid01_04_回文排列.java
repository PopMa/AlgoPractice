package 程序员面试金典;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * <p>
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * <p>
 * 回文串不一定是字典当中的单词。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * created by popma
 * created time: 2020/5/6, 20:40
 */
public class Pid01_04_回文排列 {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int oldval = map.getOrDefault(c, 0);
            map.put(c, oldval + 1);
        }
        int count = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                count += 1;
            }
        }
        if (count == 0 || count == 1) { // 奇数个数0或者1可以
            return true;
        } else {
            return false;
        }

    }
}
