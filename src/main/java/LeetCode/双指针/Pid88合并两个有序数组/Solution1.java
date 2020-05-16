package LeetCode.双指针.Pid88合并两个有序数组;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/22, 1:40 下午
 */
// 双指针 O(m+n) space:O(m) 把num1放到其他地方

public class Solution1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int p = 0;
        int[] nums1_copy = Arrays.copyOf(nums1,m);
        while (p1 <= m - 1 && p2 <= n - 1) {
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];
        }
        if (p1<m) System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2<n) System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.printf(Arrays.toString(nums1));
    }
}
