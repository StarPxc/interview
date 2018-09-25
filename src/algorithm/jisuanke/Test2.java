package algorithm.jisuanke;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/10/4
 * 给定一个整数 numnum，将整数转换成罗马数字。
 * <p>
 * 如 1,2,3,4,51,2,3,4,5 对应的罗马数字分别为I，II，III，IV，V等，更详细的说明见
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();


        int index = 1;
        String result = "";
        while (input > 0) {

            int a = input % 10;
            String str = "";
            for (int i = 0; i < a; i++) {
                str = str + getValue(index);
            }
            index++;
            result = str + result;
            input = input / 10;
        }
        System.out.println(result);
    }

    private static String getValue(int index) {
        if (index == 1) {
            return "I";
        } else if (index == 2) {
            return "X";
        } else if (index == 3) {
            return "C";
        } else {
            return "M";
        }
    }
}
