package 剑指Offer;

import org.junit.Assert;
import org.junit.Test;

/**
 * created by popma
 * created time: 2020/5/9, 14:57
 */
public class Pid10_1_斐波那契数列 {
    public long fib(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b; // 注意顺序
            b = sum;
        }

//        return (int) (sum % 1000000007);
        return sum;
    }

    @Test
    public void test() {
//        System.out.println(fib(95));
        Assert.assertEquals(407059028, fib(95));
    }
}
