package 程序员面试金典;

import java.util.HashSet;
import java.util.Set;

/**
 * 问题：实现一个算法，确定一个字符串的所有字符是否全都不同。假使不允许使用额外的数据结构，又该如何处理？
 * created by popma
 * created time: 2020/5/6, 18:02
 */
public class Pid01_01_判断字符是否唯一 {
    // 使用了set,如果不使用数据结构怎么做?
    public boolean isUnique(String astr) {
        if (astr == null) {
            return true;
        }

        // 长度大于256就一定有重复的
        if (astr.length() > 256) {
            return false;
        }

        char[] chars = astr.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : chars) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                return false;
            }
        }
        return true;
    }

    // 位运算:(假设只有a-z)
    public boolean isUnique2(String astr) {
        if (astr == null) {
            return true;
        }
        if (astr.length() > 256) {
            return false;
        }
        int checkFlag = 0;
        for (int i = 0; i < astr.length(); i++) {
            int val = astr.charAt(i) - 'a';
            if ((checkFlag & (1 << val)) == 0) { // 0&1=0
                // 标记第val个数字已经出现了(从右往左第val个数)
                checkFlag |= (1 << val);
            } else {
                return false;
            }
        }
        return true;
    }
}
