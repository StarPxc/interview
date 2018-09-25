package algorithm.array;

import java.util.Scanner;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm
 * @Description: TODO
 * @date 2018/4/7 14:48
 */
public class Test4 {
    public static void main(String[] args) {
        String[] strs = new String[]{"", "b"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prifex = strs[0];        // 默认将第一个认为是最长共同

        for (int i = 1; i < strs.length; i++) {
            // 将当前最长共同字符串和当前数组中的对比,把小的那个作为长度
            int len = prifex.length() > strs[i].length() ? strs[i].length() : prifex.length();

            int j = 0;
            for (; j < len; j++) {
                // 逐个字符比较,不等的时候退出
                if (prifex.charAt(j) != strs[i].charAt(j))
                    break;
            }
            // 退出的j即当前的最小,整个遍历结束后就是整个的最小了
            prifex = prifex.substring(0, j);
        }

        return prifex;
    }
}
