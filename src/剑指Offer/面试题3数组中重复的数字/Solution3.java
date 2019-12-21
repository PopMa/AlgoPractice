package 剑指Offer.面试题3数组中重复的数字;

/**
 * created by popma
 * created time: 2019/12/10, 11:41 PM
 * 面试题3的第二个问题
 */
public class Solution3 {
    public int getCount(int numbers[], int length, int start, int end) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                ++count;
            }
        }
        return count;
    }

    // numbers 长度是n+1,里面的数字是1～n,找任意一个重复的即可
    public int duplicate(int numbers[], int length) {
        if (length <= 0) {
            return -1;
        }
        int start = 1;
        int end = length - 1;
        while (end >= start) {
            int middle = start + (end - start) / 2;
            int count = getCount(numbers, length, start, middle);
            if (end == start){
                if (count>1) return start;
                else return -1;
            }
            if (count > (middle - start) + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
