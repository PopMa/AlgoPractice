package 每日一题202005;

import org.junit.Test;

/**
 * created by popma
 * created time: 2020/5/11, 10:06
 */
public class Pid50_Pow_x_n {
    // 二进制拆分
    private double pow(double x, long n) {
        double res = 1.0;
        double mul = x;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= mul;
            }
            mul *= mul;
            n >>= 1;
        }
        return res;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N > 0 ? pow(x, n) : 1.0 / pow(x, -N);
    }

    @Test
    public void test() {
        System.out.println(myPow(2, 5));
    }
}
