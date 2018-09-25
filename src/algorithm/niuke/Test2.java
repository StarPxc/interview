package algorithm.niuke;

/**
 * Create by Ethan on 2017/11/2
 * 题目描述
 * 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
 * 给定字符串A以及它的长度n，请返回最长回文子串的长度。
 * 测试样例：
 * "abc1234321ab",12
 * 返回：7
 */

public class Test2 {


    /*    public int findLongest(String A, int n, String B, int m) {
            // write code here
            int[][] arr = new int[n + 1][m + 1];
            int max = 0;
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    if (A.charAt(i - 1) == B.charAt(j - 1)) {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                        max = Math.max(max, arr[i][j]);
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
            return max;
        }*/
    public int findLongest(String A, int n, String B, int m) {
        // write code here
        int[][] dp = new int[n][m];
        //行初始化
        for (int j = 0; j < m; j++) {
            if (A.charAt(0) == B.charAt(j))
                dp[0][j] = 1;
        }
        //列初始化
        for (int i = 0; i < n; i++) {
            if (B.charAt(0) == A.charAt(i))
                dp[i][0] = 1;
        }
        //dp过程
        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
