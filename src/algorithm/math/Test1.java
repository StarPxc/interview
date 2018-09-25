package algorithm.math;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.math
 * @Description: TODO
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * @date 2018/4/16 16:09
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

    private static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            dividend++;
        }
        boolean flag = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            flag = false;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = 0;
        int current = divisor;
        while (current <= dividend) {
            result++;
            current = current + divisor;
        }

        return flag ? result : -result;
    }
}
