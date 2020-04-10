package LeetCode.NineChapter.Ch1二分查找.Pid74搜索二维矩阵;

/**
 * created by popma
 * created time: 2019/12/29, 7:24 下午
 */
public class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0||matrix[0].length==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            int x=mid/n,y=mid%n;
            if (matrix[x][y] == target){
                high = mid;
            }else if (matrix[x][y] < target){
                low=mid;
            }else {
                high=mid;
            }
        }
        if (matrix[low/n][low%n]==target||matrix[high/n][high%n]==target) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,1}};
        System.out.println(searchMatrix(matrix,0));
    }
}
