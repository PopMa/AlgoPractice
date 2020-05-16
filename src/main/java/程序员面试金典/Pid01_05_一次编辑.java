package 程序员面试金典;

import org.junit.Test;

/**
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
 * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 * created by popma
 * created time: 2020/5/6, 20:54
 */
public class Pid01_05_一次编辑 {
    public boolean oneEditAway(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        if (first.equals(second)) {
            return true;
        }
        int len1 = first.length();
        int len2 = second.length();

        if (Math.abs(len1 - len2) > 1) {
            return false;
        }
        // 保证第一个短
        if (len1 > len2) return oneEditAway(second, first);

        boolean has = false; // 只能有一个不一样
        for (int i = 0, j = 0; i < len1 && j < len2; i++, j++) {
            // 遇到不想等的开始比较
            if (first.charAt(i) != second.charAt(j)) {
                if (has) {
                    return false;
                } else {
                    if (len2 > len1) {
//                        j+=1;
                        i -= 1; // 反过来对短的后退一位,因为一会i++,j++
                    }
//                    j+=1;
                    has = true; // 已经错了一次
                }
            }
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(oneEditAway("pasl", "psl"));
        System.out.println(oneEditAway("teacher", "pteacher"));
        System.out.println(oneEditAway("abc", "bbbc"));
    }
}
