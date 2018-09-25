package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 最长回文【子串】(连续)
 * @date 2018/4/6 10:21
 */
public class Test5 {
    private static String longestPalindrome2(String s) {
        if (s == null)
            return null;
        if (s.length() <= 1)
            return s;
        int maxLen = 0;
        String longestStr = null;
        int length = s.length();
        int[][] table = new int[length][length];
        //单个字母是回文
        for (int i = 0; i < length; i++) {
            table[i][i] = 1;
        }
        //两个连续的字母是回文
        for (int i = 0; i <= length - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = 1;
                longestStr = s.substring(i, i + 2);

            }
        }

        //l代表回文子串长度，从3开始
        for (int l = 3; l <= length; l++) {
            for (int i = 0; i <= length - l; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if (table[i][j] == 1 && l > maxLen)
                        longestStr = s.substring(i, j + 1);
                } else {
                    table[i][j] = 0;
                }
            }
        }
        if (longestStr == null) {
            return s.charAt(0) + "";
        }

        return longestStr;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome2("abcda"));
    }
}
