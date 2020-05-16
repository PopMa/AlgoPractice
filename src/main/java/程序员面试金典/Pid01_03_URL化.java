package 程序员面试金典;

import org.junit.Test;

/**
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，
 * 并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-url-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * created by popma
 * created time: 2020/5/6, 19:02
 */
public class Pid01_03_URL化 {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaceCount += 1;
            }
        }

        int newLength = length + spaceCount * 2;
        int p = newLength - 1;

        char[] res = new char[newLength];
        // 字符串常用操作:从后往前
        for (int i = length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                res[p] = '0';
                res[p - 1] = '2';
                res[p - 2] = '%';
                p -= 3;
            } else {
                res[p] = chars[i];
                p -= 1;
            }
        }
        return new String(res);
    }

    @Test
    public void test() {
        System.out.println(replaceSpaces("Mr dee", 6));
    }
}
