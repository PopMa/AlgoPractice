package LeetCode.恢复旋转排序数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by popma
 * created time: 2019/12/30, 11:00 下午
 */
// 三步反转法
public class Solution {
    public static void recoverRotatedSortedArray(List<Integer> nums) {
        int pos = 0;
        for (int i =0;i<nums.size()-1;i++){
            if (nums.get(i) > nums.get(i+1)) pos=i+1;
        }
        reverse(nums,0, pos-1);
        reverse(nums,pos, nums.size()-1);
        reverse(nums,0, nums.size()-1);
    }

    public static void reverse(List<Integer> nums,int start,int end){
        while (start<end){
            int temp = nums.get(start);
            nums.set(start,nums.get(end));
            nums.set(end,temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,1,1,1,-1,1,1,1,1));
        recoverRotatedSortedArray(nums);
        System.out.println(nums.toString());
    }
}
