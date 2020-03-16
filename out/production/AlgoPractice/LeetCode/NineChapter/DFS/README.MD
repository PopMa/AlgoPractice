## DFS 两个重要的点
1. 截止条件:
什么时候结束递归

2. 筛选条件:
继续在哪些数据中查找

> 下面是LC_Pid46的Core code
```$java
public void dfs(int[] nums, boolean[] isVisited, int level, List<Integer> tmpRes) {
        // 截止条件
        if (level == nums.length+1) {
            res.add(new ArrayList<>(tmpRes));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            // 筛选条件
            if (!isVisited[i]){
                tmpRes.add(item);
                isVisited[i] = true;
                dfs(nums, isVisited, level+1, tmpRes);
                tmpRes.remove(tmpRes.size()-1);
                isVisited[i] = false;
            }
        }
    }
``` 

## 使用场景:
列出所有的方案的时候

90%的DFS是排列和组合
