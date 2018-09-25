package algorithm.niuke;

/**
 * Create by Ethan on 2017/11/3
 * 又到年底统计报表的时间了。我们公司一共生产“0”到“9”十种产品，现在给你一份销售记录，请你帮忙绘制一份直方图。
 * <p>
 * 输入描述:
 * 输入包含多组数据，每组数据包含一个字符串s。
 * <p>
 * s仅包含数字，长度不超过100。
 * <p>
 * <p>
 * 输出描述:
 * 对应每一组数据，依次为十种产品绘制高度等于其销量的“*”柱图。
 * <p>
 * 直方图的高度等于数据中数量最多产品的个数，如果某种产品高度不到直方图的高度，用空格补全。
 * <p>
 * 直方图下方依次输出0到9作为坐标。
 * <p>
 * 输入例子:
 * 0123456789123
 * 123012312
 * <p>
 * 输出例子:
 * **
 * *********
 * 0123456789
 * *
 * **
 * ***
 * 0123456789
 */
public class Test5 {
    public static int getCharCount(int c, String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if ((char) c == temp)
                count++;
        }
        return count;
    }

    private static void execute(String input) {
        int j = 0;
        int sum = 0;
        int appear[] = new int[10];
        for (int i = 0; i < appear.length; i++) {
            appear[i] = getCharCount(i, input);
            System.out.println(appear[i]);
        }

    }

    public static void main(String[] args) {
        execute("0123456789123");
    }
}
