package 剑指Offer.面试题3数组中重复的数字;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/10, 11:06 PM
 */
public class Main {
    public static void main(String[] args) {
//        Solution1 solution = new Solution1();
//        Solution2 solution = new Solution2();
        Solution3 solution3 = new Solution3();
//        int numbers[] = {2,1,2,1,4};
        int[] numbers = {2,3,5,4,3,2,6,7};
        int length = 8;
        int res = solution3.duplicate(numbers,length);
        System.out.println(res);
    }
}
