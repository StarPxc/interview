package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 * <p>
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 * <p>
 * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 * 输入: cost = [10, 15, 20]
 * 输出: 15
 * 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
 * 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * 输出: 6
 * 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
 * @date 2018/4/6 15:37
 */
public class Test8 {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 15, 20};
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {

        if (cost.length == 1) {
            return cost[0];
        } else if (cost.length == 0) {
            return 0;
        } else if (cost.length == 1) {
            return Math.min(cost[0], cost[1]);
        } else {
            int dp[] = new int[cost.length + 1];
            dp[0] = 0;
            dp[1] = 0;
            for (int i = 2; i <= cost.length; i++) {
                int A = dp[i - 1] + cost[i - 1];
                int B = dp[i - 2] + cost[i - 2];
                dp[i] = Math.min(A, B);
            }
            return dp[cost.length];
        }

    }
}
