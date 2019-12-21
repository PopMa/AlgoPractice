package LeetCode.CyC2018.双指针.有序数组的TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by popma
 * created time: 2019/12/21, 11:58 下午
 */
// 和Two Sum1 做法一样
public class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low<high){
            int sum = numbers[low] + numbers[high];
            if (sum < target) low++;
            else if (sum>target) high--;
            else return new int[]{low+1,high+1};
        }
        return null;
    }

}
