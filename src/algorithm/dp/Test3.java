package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 爬楼梯
 * @date 2018/4/5 21:12
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(5);
    }

    public static int dbStair(int n) {
        int dp[] = new int[n + 3];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
