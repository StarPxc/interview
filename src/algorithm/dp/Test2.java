package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 给定一个数字和一个数组，问能否由数组中的元素相加得到
 * @date 2018/4/5 17:16
 */
public class Test2 {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 34, 4, 12, 5, 2};
        System.out.println(recSubset(arr, arr.length - 1, 9));

    }

    private static boolean recSubset(int arr[], int i, int s) {
        /**
         * 注意：递归出口有三个
         */
        if (s == 0) {
            return true;
        } else if (i == 0) {
            return arr[0] == s;
        } else if (arr[i] > s) {
            return recSubset(arr, i - 1, s);
        } else {
            //选
            boolean select = recSubset(arr, i - 1, s - arr[i]);
            //不选
            boolean deselect = recSubset(arr, i - 1, s);
            return select || deselect;
        }
    }

    private static boolean db_subset(int[] arr, int s) {
        boolean dp[][] = new boolean[arr.length][s + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 0; i < s + 1; i++) {
            dp[0][i] = false;
        }
        dp[0][arr[0]] = true;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < s + 1; j++) {
                if (arr[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    boolean A = dp[i - 1][j - arr[i]];
                    boolean B = dp[i - 1][j];
                }
            }
        }

        return dp[arr.length - 1][s];

    }
}
