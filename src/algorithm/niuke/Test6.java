package algorithm.niuke;

import java.util.Arrays;

/**
 * Create by Ethan on 2017/11/4
 * 题目描述
 * 对于一个无序数组，数组中元素为互不相同的整数，请返回其中最小的k个数，顺序与原数组中元素顺序一致。
 * 给定一个整数数组A及它的大小n，同时给定k，请返回其中最小的k个数。
 * 测试样例：
 * [1,2,4,3],4,2
 * 返回：[1,2]
 */
public class Test6 {


    public static int[] findKthNumbers(int[] A, int n, int k) {
        int[] CA = new int[n];
        System.arraycopy(A, 0, CA, 0, n);
        Arrays.sort(CA);
        int[] min = new int[k];
        int index = 0;
        int number = CA[k - 1];
        for (int i = 0; i < n; i++) {
            if (A[i] <= number) {
                min[index] = A[i];
                index++;
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
