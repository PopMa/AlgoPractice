package LeetCode.NineChapter.DFS.Pid39组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 16:38
 */
public class Solution {
    List<List<Integer>> results = new ArrayList<>();
    int target = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        Arrays.sort(candidates);
        List<Integer> temRes = new ArrayList<>();
        dfs(candidates, 0, temRes, target);
        return results;
    }

    private int getSum(List<Integer> temRes) {
        int sum = 0;
        for (Integer i : temRes) {
            sum += i;
        }
        return sum;
    }

//    public void dfs(int[] candidates, int index, List<Integer> temRes) {
//        if (getSum(temRes) > target) {
//            return;
//        }
//
//        if (getSum(temRes) == target) {
//            results.add(new ArrayList<>(temRes));
//            return;
//        }
//
//        for (int i = index; i < candidates.length; i++) {
//            if (i != 0 && candidates[i] == candidates[i - 1]) {
//                continue;
//            }
//
//            temRes.add(candidates[i]);
//            dfs(candidates, i, temRes);
//            temRes.remove(temRes.size() - 1);
//        }
//    }

    // 优化一下
    public void dfs(int[] candidates, int index, List<Integer> temRes, int remainTarget) {
        if (remainTarget < 0) {
            return;
        }

        if (remainTarget == 0) {
            results.add(new ArrayList<>(temRes));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (i != 0 && candidates[i] == candidates[i - 1]) {
                continue;
            }

            temRes.add(candidates[i]);
            dfs(candidates, i+1, temRes, remainTarget - candidates[i]);
            temRes.remove(temRes.size() - 1);
        }
    }

}
