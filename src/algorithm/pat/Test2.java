package algorithm.pat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/5
 * 本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。你需要输出商数Q和余数R，使得A = B * Q + R成立。
 * <p>
 * 输入描述:
 * 输入在1行中依次给出A和B，中间以1空格分隔。
 * <p>
 * <p>
 * 输出描述:
 * 在1行中依次输出Q和R，中间以1空格分隔。
 * <p>
 * 输入例子:
 * 123456789050987654321 7
 * <p>
 * 输出例子:
 * 17636684150141093474 3
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String A = console.next();
        String B = console.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        BigInteger q = a.divide(b);
        BigInteger r = a.subtract(b.multiply(q));
        System.out.println(q + " " + r);
    }
}
