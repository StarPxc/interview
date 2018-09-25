package algorithm.jisuanke;

import java.util.Scanner;

/**
 * 给定一个升序排列的数组，去掉重复的数，并输出新的数组的长度。
 * <p>
 * 例如：数组 A = \{1, 1, 2\}A={1,1,2}，你的程序应该输出 22 即新数组的长度，新数组为 \{1, 2\}{1,2}
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        int[] arrs = new int[input];
        for (int i = 0; i < input; i++) {
            int a = console.nextInt();
            arrs[i] = a;
        }
        for (int i = 0; i < arrs.length - 1; i++) {
            if (arrs[i] == arrs[i + 1]) {
                input--;
            }
        }
        System.out.println(input);
    }
}
