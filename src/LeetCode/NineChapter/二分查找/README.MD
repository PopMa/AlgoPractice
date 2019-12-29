二分查找
第1境界：
二分法的模板 Pid704
start+1<end
start+(end-start)/2
nums[mid]==,<,>target
返回index nums[start] or nums[end]

第2境界：
1.找到数组第一个/最后一个满足条件的位置 Pid374/278/34
2.无限大小的数组 -> Pid702无限有序数组的查找 
:首先要倍增扩容找到high（二分查找的上限）

第3境界 二分位置 之 Half half
并无法找到一个条件，形成 OOXX 的模型 但可以根据判断，保留下有解的那一半或者去掉无解的一半
