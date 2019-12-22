package LeetCode.CyC2018.双指针.Pid88合并两个有序数组;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/22, 2:35 下午
 */
// time:O(m+n)
// 三指针
public class Solution2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        if (p2 >= 0) System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.printf(Arrays.toString(nums1));
    }
}
