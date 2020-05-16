package LeetCode.排序.Pid75颜色分类;


import java.util.Arrays;

/**
 * created by popma
 * created time: 2019/12/23, 2:50 下午
 */
// 荷兰国旗问题
public class Solution1{
    public static void swap(int nums[], int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public static void sortColors(int[] nums) {
        int left = 0, right = nums.length-1; // left左边的都是0， right右边的都是2；
        int i =0;
        while (i<=right){
            if (nums[i] == 2) {
                swap(nums,i,right);
                right--;
            }
            else if (nums[i] == 0) {
                swap(nums,i,left);
                i++;
                left++;
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
