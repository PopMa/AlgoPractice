package LeetCode.NineChapter.Ch1二分查找.Pid852山脉数组的峰顶索引;

/**
 * created by popma
 * created time: 2019/12/29, 10:01 下午
 * 给 n 个整数的山脉数组，即先增后减的序列，找到山顶（最大值）
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class Solution2 {
    /**
     * @param A: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int peakIndexInMountainArray(int[] A) {
        if (A.length == 0) return -1;
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < A[mid + 1]) { // 左边都是一直上升的
                start = mid;
            } else {
                end = mid;
            }
        }
        return A[start] > A[end] ? start : end;
    }




}
