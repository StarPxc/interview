package algorithm.dp;

/**
 * @author 浦希成
 * 2018/9/23 14:18
 * 求最长公共子序列
 */
public class Test14 {
    public int minDistance(String s1, String s2) {
        return s1.length() + s2.length() - 2 * lcs(s1, s2, s1.length(), s2.length());
    }
    //递归法
    public int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0){
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)){
            return 1 + lcs(s1, s2, m - 1, n - 1);

        }
        else{
            return Math.max(lcs(s1, s2, m, n - 1), lcs(s1, s2, m - 1, n));

        }
    }
    //动态规划
    public int minDistance2(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<word1.length()+1;++i){
            for(int j=0;j<word2.length()+1;++j){
                if(i==0||j==0) {
                    continue;
                }
                if(word1.charAt(i-1)==word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return word1.length()+word2.length()-2*dp[word1.length()][word2.length()];
    }
}
