package LeetCode.NineChapter.排序;

import java.util.Arrays;

/**
 * created by popma
 * created time: 2020/4/23, 20:56
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arrays = {2, 3, 4, 5, 1, 5, 2, 9, 5, 6, 8, 3, 1};
//        bubbleSort1(arrays);
//        bubbleSort15(arrays);
        bubbleSort2(arrays,0,arrays.length-1);
        System.out.println(Arrays.toString(arrays));
    }

    /**
     * ============冒泡排序 v1 非递归====================
     **/
    private static void bubbleSort1(int[] arrays) {
        int len = arrays.length;
        for (int i = 0; i < len - 1; i++) { // 每经历一次排序,最大的元素都放到了最末端
            for (int j = 0; j < len - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    swap(arrays, j, j + 1);
                }
            }
        }

    }

    // 用于冒泡排序中元素的交换
    private static void swap(int[] arrays, int i, int j) {
        int temp; // 临时变量作为交换元素的中转
        temp = arrays[j];
        arrays[j] = arrays[i];
        arrays[i] = temp;
    }


    /**
     * ============冒泡排序 v1.5 非递归优化=========
     * 优化:如果某次排序中没有新的逆序对,则排序已完成
     * ===========
     **/
    private static void bubbleSort15(int[] arrays) {
        int len = arrays.length;
        int flag = 0;
        for (int i = 0; i < len - 1; i++) { // 每经历一次排序,最大的元素都放到了最末端
            for (int j = 0; j < len - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    flag = 1;
                    swap(arrays, j, j + 1);
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    /**
     * ============冒泡排序 v2 递归=========
     * 优化:如果某次排序中没有新的逆序对,则排序已完成
     * ===========
     **/
    private static void bubbleSort2(int[] arrays, int L, int R) { // 和求数组最大值一样,都用L/R
        if (L == R){
            return;
        }
        for (int i = L; i < R; i++) { // 每经历一次排序,最大的元素都放到了最末端
            if (arrays[i] > arrays[i + 1]) {
                swap(arrays, i, i + 1);
            }
        }
        bubbleSort2(arrays,L,R-1);
    }
}
