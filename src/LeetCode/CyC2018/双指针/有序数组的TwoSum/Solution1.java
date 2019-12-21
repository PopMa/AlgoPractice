package LeetCode.CyC2018.双指针.有序数组的TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by popma
 * created time: 2019/12/21, 11:58 下午
 */
// 和Two Sum1 做法一样
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            final Integer value = hashMap.get(numbers[i]);
            if (value != null) {
                return new int[]{value + 1, i + 1};
            }
            hashMap.put(target - numbers[i], i);
        }
        return null;
    }

}
