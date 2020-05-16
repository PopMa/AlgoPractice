package 每日一题202005;

import org.junit.Test;

/**
 * created by popma
 * created time: 2020/5/10, 17:58
 */
public class Pid69_x的平方根 {
    public int mySqrt(int x) {
        int left = 0, right = x;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid;
            } else if (mid * mid < x) {
                left = mid;
            } else if (mid * mid == x) {
                return mid;
            }
        }
        if (right * right <= x) {
            return right;
        } else {
            return left;
        }
    }

    @Test
    public void test() {
        System.out.println(mySqrt(2601));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(9));
    }
}
