package algorithm.string;

/**
 * @author 浦希成
 * 2018/9/25 10:54
 * 字符串转数字
 */

import java.util.Scanner;

public class StringToInt {
    private static int Max_INT = Integer.MAX_VALUE;
    private static int Min_INT = Integer.MIN_VALUE;

    private int getStringToInt(String A) {
        char[] arrayA = A.toCharArray();
        int n = 0;
        //判断输入是否为空
        if ("".equals(A)) {
            return 0;
        }
        int i = 0;
        //处理字符串首位的空格
        while (arrayA[i] == ' ') {
            i++;
        }
        //用于判定输入字符串数字的正负，初始化为1表示为正数
        int sign = 1;
        if (arrayA[i] == '+' || arrayA[i] == '-') {
            if (arrayA[i] == '-') {
                sign = -1;
            }
            i++;
        }
        //确定是数字0~9才执行循环
        while (i < arrayA.length && Character.isDigit(arrayA[i])) {
            int c = arrayA[i] - '0';
            //把之前得到的数字乘以10，再加上 当前字符表示的数字
            n = n * 10 + c;
            i++;
        }

        return sign > 0 ? n : -n;
    }

    public static void main(String[] args) {
        StringToInt test = new StringToInt();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个由数字组成的字符串：");
        String A = in.nextLine();
        int result = test.getStringToInt(A);
        System.out.println("整数result = " + result);
    }
}
