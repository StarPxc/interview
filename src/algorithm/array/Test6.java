package algorithm.array;

/**
 * @author 浦希成
 * 2018/9/22 15:04
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(-2147483648));
    }

    private static int NumberOf1(int n) {
        int sum = 0;
        if (n > 0) {
            while (n != 1) {
                if (n % 2 == 1) {
                    sum++;
                }
                n=n/2;
            }
            sum++;
        }else {
            n=Math.abs(n);
            if (n % 2 == 0) {
                sum++;
            }
            n=n/2;
        }
        return n==0?0:sum;
    }
}
