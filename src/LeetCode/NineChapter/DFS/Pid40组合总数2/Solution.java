package LeetCode.NineChapter.DFS.Pid40组合总数2;

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

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
            // 存在跳过的情况,如[1,1,2] target=3 , [1,2] ;[1,2]
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            temRes.add(candidates[i]);
            dfs(candidates, i + 1, temRes, remainTarget - candidates[i]);
            temRes.remove(temRes.size() - 1);
        }
    }

}
