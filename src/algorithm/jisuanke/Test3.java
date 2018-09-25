package algorithm.jisuanke;

import java.util.Scanner;

/**
 * 给定一个数组 AA，除了一个数出现一次之外，其余数都出现三次。找出出现一次的数。
 * <p>
 * 如：\{1, 2, 1, 2, 1, 2, 7\}{1,2,1,2,1,2,7}，找出 77。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        int[] arrs = new int[input];
        for (int i = 0; i < input; i++) {
            int a = console.nextInt();
            arrs[i] = a;
        }

        for (int i = 0; i < arrs.length; i++) {
            int t = 0;
            for (int j = 0; j < arrs.length; j++) {
                if (arrs[i] == arrs[j]) {
                    t++;
                }
            }
            if (t == 1) {
                System.out.println(arrs[i]);
                break;
            }
        }

    }

}
