package LeetCode.CyC2018.双指针.Pid345反转字符串中的元音字母;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by popma
 * created time: 2019/12/22, 11:02 上午
 */
public class Solution {
    public static String reverseVowels(String s) {
        char[] s2= s.toCharArray();
        int low=0,high=s2.length-1;
        Set<Character> set = new HashSet<Character>(Arrays.asList('a', 'e','i','o','u','A','E','I','O','U'));
        while (low<high){
            while (!set.contains(s2[low]) && low<high) low++;
            while (!set.contains(s2[high]) && low<high) high--;
            if (low<high){
                char temp = s2[low];
                s2[low] = s2[high];
                s2[high] = temp;
                low++;high--;
            }
        }
        return new String(s2);
    }

    public static void main(String[] args) {
        String s = ",.";
        System.out.printf(reverseVowels(s));
    }
}
