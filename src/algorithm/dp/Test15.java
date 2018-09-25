package algorithm.dp;

/**
 * @author 浦希成
 * 2018/9/23 15:23
 * 最长公共子串
 */
public class Test15 {
    public static void main(String[] args) {
        String a = "abcyu09o";
        String b = "cyu11";
        int result = 0;
        int len1 = a.length();
        int len2 = b.length();
        StringBuilder resurlString = new StringBuilder();
        int dp[][] = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    resurlString.append(a.charAt(i - 1));
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(result);
        System.out.println(resurlString);
    }
}
