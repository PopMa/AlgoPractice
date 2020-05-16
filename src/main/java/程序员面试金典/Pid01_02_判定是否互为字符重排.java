package 程序员面试金典;

import org.junit.Test;

import java.util.Arrays;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * created by popma
 * created time: 2020/5/6, 18:20
 */
public class Pid01_02_判定是否互为字符重排 {
    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // 排序就不用额外空间,不排序就是两边遍历,需要数组或map
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.equals(s2)) { // 包括两者都为null
            return true;
        }

        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        return sort(s1).equals(sort(s2));
    }

    @Test
    public void Dtest() {
        System.out.println(CheckPermutation("abc", "cba"));
    }
}
