package 程序员面试金典;

import org.junit.Test;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/compress-string-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * created by popma
 * created time: 2020/5/6, 22:00
 */
public class Pid01_06_字符串压缩 {
    public String compressString(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char last = S.charAt(0);
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == last) {
                count += 1;
            } else {
                sb.append(last + String.valueOf(count));
                count = 1;
                last = S.charAt(i);
            }
        }
        sb.append(last + String.valueOf(count)); // 最后一串

        // res
//        if (sb.length() >= S.length()) {
//            return S;
//        } else {
//            return sb.toString();
//        }
        return sb.length() > S.length() ? sb.toString() : S;
    }

    @Test
    public void test() {
        System.out.println(compressString("aabbCCCaa"));
        System.out.println(compressString("aaCCCaa"));
        System.out.println(compressString("aaEEEEEECCCaa"));
    }

}
