package algorithm.pat;


import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/5
 * 正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
 * <p>
 * 现给定A、DA、B、DB，请编写程序计算PA + PB。
 * <p>
 * 输入描述:
 * 输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 1010。
 * <p>
 * <p>
 * 输出描述:
 * 在一行中输出PA + PB的值。
 * <p>
 * 输入例子:
 * 3862767 6 13530293 3
 * <p>
 * 输出例子:
 * 399
 */
public class Test1 {
    public static int execute(String a, char n, String b, char m) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == n) {
                str1 += n;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == m) {
                str2 += m;
            }
        }
        if (str1.equals("")) {
            str1 = "0";
        }
        if (str2.equals("")) {
            str2 = "0";
        }
        return Integer.parseInt(str1) + Integer.parseInt(str2);

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.next();
        char n = console.next().toCharArray()[0];
        String b = console.next();
        char m = console.next().toCharArray()[0];
        System.out.println(execute(a, n, b, m));

    }
}
