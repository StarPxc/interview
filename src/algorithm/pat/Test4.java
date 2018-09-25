package algorithm.pat;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/5
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner conosle = new Scanner(System.in);
        int arrs[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arrs[i] = conosle.nextInt();
            sum += arrs[i];
        }
        int a[] = new int[sum];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arrs[i]; j++) {
                str.append(i);
            }
        }
        int b[] = new int[str.length()];
        for (int i = 0; i < b.length; i++) {
            b[i] = str.charAt(i) - '0';
        }
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                int temp = b[i];
                b[i] = b[0];
                b[0] = temp;
                break;
            }
        }

        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i]);

        }

    }
}
