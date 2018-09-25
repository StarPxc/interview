package algorithm.pat;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/5
 * 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
 * <p>
 * 输入描述:
 * 每个输入包含1个测试用例，即一个不超过1000位的正整数N。
 * <p>
 * <p>
 * 输出描述:
 * 对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。
 * <p>
 * 输入例子:
 * 100311
 * <p>
 * 输出例子:
 * 0:2
 * <p>
 * 1:3
 * <p>
 * 3:1
 */
public class Test3 {
    public static void main(String[] args) {
        int arrs[] = new int[10];
        Scanner console = new Scanner(System.in);
        String input = console.next();
        char[] a = input.toCharArray();
        for (int i = 0; i < a.length; i++) {
            arrs[a[i] - '0']++;
        }
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] != 0) {
                System.out.println(i + ":" + arrs[i]);
            }
        }
    }
}
