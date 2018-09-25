package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 假设你有一个数组，其中第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果您只能完成最多一笔交易（即买入和卖出一股股票），则设计一个算法来找到最大的利润。
 * 输入: [7, 1, 5, 3, 6, 4]
 * 输出: 5
 * <p>
 * 最大利润 = 6-1 = 5（不是 7-1 = 6, 因为卖出价格需要大于买入价格）
 * 输入: [7, 6, 4, 3, 1]
 * 输出: 0
 * <p>
 * 在这种情况下, 没有交易完成, 即最大利润为 0。
 * @date 2018/4/6 12:34
 */
public class Test7 {
    public static void main(String[] args) {
        int arr[] = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
    }

    /**
     * O(n2)
     *
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices) {
        int maxValue = 0;
        for (int i = 0; i < prices.length; i++) {
            int j = prices.length - 1;
            int max = prices[i];
            while (i != j) {
                if (max < prices[j]) {
                    max = prices[j];
                }
                j--;
            }
            if (maxValue < max - prices[i]) {
                maxValue = max - prices[i];
            }

        }
        return maxValue;
    }

    private static int maxProfitBetter(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            if (min > prices[i]) min = prices[i];
        }
        return profit;
    }
}
