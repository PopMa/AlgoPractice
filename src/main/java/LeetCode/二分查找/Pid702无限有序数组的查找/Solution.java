package LeetCode.二分查找.Pid702无限有序数组的查找;

/**
 * created by popma
 * created time: 2019/12/29, 5:20 下午
 */
// 没有mid
// 题目没有解锁，没有提交过
//这题目其实主要考察个如何“倍增”，二分法的内容其实没啥区别。
public class Solution {
    public int searchBigSortedArray(ArrayReader reader, int target) {
        if (reader.get(0) == target) return 0;
        int count = 1;
        while (reader.get(count - 1) < target) {
            count *= 2;
        }
        int start = count / 2, end = count - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (reader.get(mid) < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (reader.get(start) == target) return start;
        if (reader.get(end) == target) return end;
        return -1;
    }
}
