package algorithm.jisuanke;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/1
 * 给定一个非负整数数组，假定你的初始位置为数组第一个下标。
 * <p>
 * 数组中的每个元素代表你在那个位置能够跳跃的最大长度。
 * <p>
 * 请确认你是否能够跳跃到数组的最后一个下标。
 * <p>
 * 例如：A = [2,3,1,1,4]能够跳跃到最后一个下标，输出true；
 * <p>
 * A = [3,2,1,0,4] 不能跳跃到最后一个下标，输出false。
 * <p>
 * 输入格式
 * <p>
 * 第一行输入一个正整数 n(1 \leq n \leq 500)n(1≤n≤500)，接下来的一行 nn 个整数，输入数组 A_iA
 * ​i
 * ​​ 。
 * <p>
 * 输出格式
 * <p>
 * 如果能跳到最后一个下标，输出true，否则输出false。
 * <p>
 * 样例输入
 * <p>
 * 5
 * 2 0 2 0 1
 * 样例输出
 * <p>
 * true
 */

public class Test5 {
    public static void main(String[] args) {
        int count, i, max = 0;
        Scanner stdin = new Scanner(System.in);
        count = stdin.nextInt();
        int[] a = new int[1000];
        for (i = 0; i < count; i++) {
            a[i] = stdin.nextInt();
        }
        for (i = 0; i < count; i++) {
            if (i > max) {
                System.out.println("false");
                return;
            }
            if (i + a[i] > max)
                max = i + a[i];
        }
        System.out.println("true");
    }


}
