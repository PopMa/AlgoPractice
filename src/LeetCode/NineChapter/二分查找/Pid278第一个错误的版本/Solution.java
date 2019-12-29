package LeetCode.NineChapter.二分查找.Pid278第一个错误的版本;

/**
 * created by popma
 * created time: 2019/12/29, 4:59 下午
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 *
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 *
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-bad-version
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
class VersionControl{

}
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1,end = n;
        while(start+1<end){
            int mid = start+(end-start)/2;
            boolean res = isBadVersion(mid);
            if(res == true){
                end = mid;
            }else{
                start = mid;
            }
        }

        if(isBadVersion(start)) return start;
        if(isBadVersion(end)) return end;
        return -1;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}