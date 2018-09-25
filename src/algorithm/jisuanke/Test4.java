package algorithm.jisuanke;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/1
 * 在一个数组中找出和最大的连续几个数。（至少包含一个数）
 * <p>
 * 例如：
 * <p>
 * 数组A[] = [−2, 1, −3, 4, −1, 2, 1, −5, 4]，则连续的子序列[4,−1,2,1]有最大的和6.
 * <p>
 * 输入格式
 * <p>
 * 第一行输入一个不超过1000的整数n。
 * <p>
 * 第二行输入n个整数A[i]。
 * <p>
 * 输出格式
 * <p>
 * 第一行输出一个整数，表示最大的和。
 * <p>
 * 样例输入
 * <p>
 * 3
 * 1 1 -2
 * 样例输出
 * <p>
 * 2
 */
public class Test4 {
    public static int MaxSubSequence(int arrs[], int length) {
        int ThisSum;
        int MaxSum = 0;
        for (int i = 0; i < length; i++) {
            ThisSum = 0;
            for (int j = i; j < length; j++) {
                ThisSum += arrs[j];
                if (ThisSum > MaxSum) {
                    MaxSum = ThisSum;
                }

            }
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        int[] arrs = new int[length];
        for (int i = 0; i < length; i++) {
            arrs[i] = console.nextInt();
        }
        System.out.println(MaxSubSequence(arrs, length));

    }
}
