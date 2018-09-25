package algorithm.pat;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/6
 * 八皇后
 */
public class Test6 {
    final static long N = 8;
    static long upperlim = (1 << N) - 1;
    static long sum = 0;
    static long answer = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long num = scanner.nextInt();
            answer = 0;
            sum = 0;
            test(0, 0, 0, 0, num);
            System.out.println(answer);
        }
    }

    private static void test(long row, long ld, long rd, long ans, long num) {
        if (answer > 0) return;
        if (row != upperlim) {
            long pos = upperlim & ~(row | ld | rd);
            while (pos != 0) {
                long p = pos & -pos;
                long bit = 32 - nlz(p);
                pos = pos - p;
                test(row + p, (ld + p) << 1, (rd + p) >> 1, ans * 10 + bit, num);
            }
        } else {
            sum++;
            if (sum == num)
                answer = ans;
        }
    }

    private static long nlz(long x) {
        long n;
        if (x == 0) return (32);
        n = 1;
        if ((x >> 16) == 0) {
            n = n + 16;
            x = x << 16;
        }
        if ((x >> 24) == 0) {
            n = n + 8;
            x = x << 8;
        }
        if ((x >> 28) == 0) {
            n = n + 4;
            x = x << 4;
        }
        if ((x >> 30) == 0) {
            n = n + 2;
            x = x << 2;
        }
        n = n - (x >> 31);
        return n;
    }
}
