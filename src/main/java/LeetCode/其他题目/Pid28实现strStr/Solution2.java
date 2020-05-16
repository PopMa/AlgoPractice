package LeetCode.其他题目.Pid28实现strStr;

/**
 * created by popma
 * created time: 2019/12/28, 1:22 下午
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution2 {
    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (needle.length() == 0) return 0;
        int m = haystack.length();
        int n = needle.length();
        int needle_code = needle.hashCode();
        for (int i =0;i<m-n+1;i++){
            if (haystack.substring(i,i+n).hashCode() == needle_code){
                return i;
            }
        }
        return -1;
    }
}
