package algorithm.jisuanke;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/1数组内存放了一些个位数字，组成一个大数（从高位到低位），现在将这个数加 11，并输出加一以后的结果。
 * <p>
 * 例如：
 * <p>
 * A = [2,3,1,1,4]A=[2,3,1,1,4]
 * <p>
 * 则结果为 [2,3,1,1,5][2,3,1,1,5]。
 * <p>
 * A = [7,8,9]A=[7,8,9]
 * <p>
 * 则结果为 [7,9,0][7,9,0]。
 * <p>
 * 输入格式
 * <p>
 * 第一行输入一个正整数 n(1 \leq n \leq 100)n(1≤n≤100)，接下来的一行，输入用空格分隔的 nn 个 00 到 99 的非负整数组成的数组 A[n]A[n]。
 * <p>
 * 输出格式
 * <p>
 * 输出一行，nn 个用空格分隔的整数，表示加一后的新数组。
 * <p>
 * 样例输入
 * <p>
 * 5
 * 8 9 9 9 9
 * 样例输出
 * <p>
 * 9 0 0 0 0
 */
public class Test6 {
    public static int power(int n) {
        if (n == 1) {
            return 1;
        }
        return 10 * power(n - 1);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        int[] arrs = new int[length];
        for (int i = 0; i < length; i++) {
            arrs[i] = console.nextInt();
        }
        int s = 1;
        int k = 0;
        for (int i = arrs.length - 1; i >= 0; i--) {
            s += arrs[k] * power(i + 1);
            k++;
        }
        char results[] = (s + "").toCharArray();
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
    }
}
