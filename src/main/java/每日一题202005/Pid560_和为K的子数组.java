package 每日一题202005;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 * created by popma
 * created time: 2020/5/15, 10:03
 */
public class Pid560_和为K的子数组 {
    // 暴力破解
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += nums[j];
                if (sum == k) {
                    count += 1;
                }
            }
        }
        return count;
    }

    // 方法2: 前缀和+哈希表优化(nb)
    public int subarraySum2(int[] nums, int k) {
        int count = 0, pre = 0;
        // map就是前缀和: 前几个数字之和为K出现相同和的次数为V
        Map<Integer, Integer> map = new HashMap<>();
        // 对于下标为 0 的元素，前缀和为 0，个数为 1
        map.put(0, 1);
//        pre[j−1]==pre[i]−k
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            // 如果前面数字之和加上这个数字正好等于K
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            // 更新map
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

    @Test
    public void test() {
        System.out.println(subarraySum2(new int[]{3, 4, 7, 2, -3, 1, 0, 2}, 7));
    }
}
