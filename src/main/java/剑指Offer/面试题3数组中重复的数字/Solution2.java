package 剑指Offer.面试题3数组中重复的数字;

/**
 * created by popma
 * created time: 2019/12/10, 10:59 PM
 * P39方法三
 */
public class Solution2 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (length <= 0) return false;
        for (int i = 0; i < length; i++) {
            if (numbers[i] < 0 || numbers[i] >= length) return false;
        }
        for (int i = 0; i < length; i++) {
            while (i != numbers[i]) {
                int j = numbers[i];
                if (numbers[j] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                } else {
                    int swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
        return false;
    }
}



