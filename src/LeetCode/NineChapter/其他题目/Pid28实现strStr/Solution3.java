package LeetCode.NineChapter.其他题目.Pid28实现strStr;


/**
 * created by popma
 * created time: 2019/12/28, 2:00 下午
 */
// KMP：O(m+n)
// Robin-Karp Algorithm https://www.jianshu.com/p/24895aca0459
// 没完成，没看懂，相对于直接暴力，这个先计算hash值...
public class Solution3 {

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (needle.length() == 0) return 0;
        int m = needle.length();
        return 1;
    }
}

