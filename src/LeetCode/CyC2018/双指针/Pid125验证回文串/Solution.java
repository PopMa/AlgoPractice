package LeetCode.CyC2018.双指针.Pid125验证回文串;

/**
 * created by popma
 * created time: 2020/3/17, 17:26
 */
public class Solution {
    private static boolean checkChar(char c) {
        if (Character.isDigit(c) || Character.isLowerCase(c) || Character.isUpperCase(c)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.equals("")) {
            return true;
        }
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !checkChar(s.charAt(i))) {
                i++;
            }
            while (i < j && !checkChar(s.charAt(j))) {
                j--;
            }
            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = ".";
        System.out.println(isPalindrome(s));
    }
}