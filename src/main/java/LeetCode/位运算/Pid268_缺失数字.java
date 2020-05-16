package LeetCode.位运算;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * created by popma
 * created time: 2020/5/14, 11:05
 */
public class Pid268_缺失数字 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (0 + n) * (n + 1) / 2;
        int tem = 0;
        for (int num : nums) {
            tem += num;
        }
        return sum - tem;
    }

    /**
     * 异或 和Pid103 只出现一次的数字 相似
     * 交换律：a ^ b ^ c <=> a ^ c ^ b
     * <p>
     * 任何数于0异或为任何数 0 ^ n => n
     * <p>
     * 相同的数异或为0: n ^ n => 0
     */
    public int missingNumber2(int[] nums) {
        return 1;
    }

}
