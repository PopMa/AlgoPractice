package Others;

/**
 * created by popma
 * created time: 2020/4/23, 20:43
 */
public class 数组内部最大值 {
    public static void main(String[] args) {
        int[] arrays = {2, 3, 4, 5, 1, 5, 2, 9, 5, 6, 8, 3, 1};
        System.out.println(findMax1(arrays));
        System.out.println(findMax2(arrays,0,arrays.length-1));
    }

    // 普通方法
    private static int findMax1(int[] arrays) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            max = Math.max(arrays[i], max);
        }
        return max;
    }

    // 递归方法
    private static int findMax2(int[] arrays,int L,int R) {
        // 1. 递归出口
        if (L==R) {
            return arrays[L];
        }
        int leftMax = arrays[L];
        int rightMax = findMax2(arrays,L+1,R); // 找出右边的最大值

        return Math.max(leftMax,rightMax);

    }
}
