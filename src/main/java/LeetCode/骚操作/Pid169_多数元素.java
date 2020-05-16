package LeetCode.骚操作;

import java.util.HashMap;
import java.util.Map;

/**
 * created by popma
 * created time: 2020/5/2, 20:36
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Pid169_多数元素 {
    // 方法1: hashmap存放元素和个数
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxVal = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], num);
            if (num > maxCount) {
                maxVal = nums[i];
                maxCount = num;
            }
        }
        return maxVal;
    }

    // 方法2:骚操作来了:摩尔计数法
    public int majorityElement2(int[] nums) {
        int maxVal = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maxVal = nums[i];
                count = 1;
            } else if (nums[i] == maxVal) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return maxVal;
    }
}
