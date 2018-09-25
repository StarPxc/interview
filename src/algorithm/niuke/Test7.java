package algorithm.niuke;

import java.util.Arrays;

/**
 * @author 浦希成
 * 2018/9/22 9:03
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray2(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reOrderArray2(int[] arr) {
        int target = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                //前偶后奇交换
                if (arr[j] % 2 == 1 && arr[j - 1] % 2 == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
    }
}
