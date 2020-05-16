package 每日一题202005;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * created by popma
 * created time: 2020/5/14, 08:52
 */
public class Pid103_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                res = i;
                break;
            }
        }
        return res;
    }

    /**
     * 要求:你可以不使用额外空间来实现吗？
     * 异或运算
     * 交换律：a ^ b ^ c <=> a ^ c ^ b
     * <p>
     * 任何数于0异或为任何数 0 ^ n => n
     * <p>
     * 相同的数异或为0: n ^ n => 0
     */
    public int singleNumber2(int[] nums) {
        int res = 0;
//        for (int i = 1; i < nums.length; i++) {
//            res ^= nums[i];
//        }
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
