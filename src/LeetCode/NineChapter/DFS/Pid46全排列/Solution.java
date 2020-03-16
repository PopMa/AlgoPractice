package LeetCode.NineChapter.DFS.Pid46全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 13:42
 */
public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int level = 1;
        if (nums.length == 0 || nums == null) {
            return res;
        }
        int length = nums.length;
        boolean[] isVisted = new boolean[length];
        for (boolean i : isVisted) {
            i = false;
        }
        List<Integer> tmpRes = new ArrayList<>();
        dfs(nums,isVisted,level,tmpRes);
        return res;
    }

    public void dfs(int[] nums, boolean[] isVisited, int level, List<Integer> tmpRes) {
        if (level == nums.length+1) {
            res.add(new ArrayList<>(tmpRes));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            if (!isVisited[i]){
                tmpRes.add(item);
                isVisited[i] = true;
                dfs(nums, isVisited, level+1, tmpRes);
                tmpRes.remove(tmpRes.size()-1);
                isVisited[i] = false;
            }
        }
    }
}
