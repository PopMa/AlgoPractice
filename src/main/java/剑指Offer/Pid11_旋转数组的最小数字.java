package 剑指Offer;

import org.junit.Test;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，
 * 输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * created by popma
 * created time: 2020/5/9, 15:41
 */
public class Pid11_旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int k = len - 1;
        while (k > 0) {
            int j = k - 1;
            if (numbers[k] < numbers[j]) {
                break;
            }
            k -= 1;
        }
        return numbers[k];
    }

    public int minArray2(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end -= 1;
            }
        }
        return nums[start];
    }

    @Test
    public void test() {
        System.out.println(minArray(new int[]{2, 3, 4, 0, 1}));
        System.out.println(minArray(new int[]{2, 2, 0, 1}));
        System.out.println(minArray(new int[]{0, 1}));
        System.out.println(minArray(new int[]{3, 1, 3}));
    }
}
