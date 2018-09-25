package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 找到一个数组中不相邻两个元素和的最大值
 * @date 2018/4/5 15:59
 */
public class Test1 {
    /**
     * 分析
     * OPT[i]表示数组下标是i的最优解
     * OPT(i)=max- 选 OPT(i-2)+arr[i]
     * - 不选 OPT(i-1)
     * 递归实现
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 4, 1, 7, 8, 3};
        System.out.println(dp_opt(arr));
    }

    private static int recOpt(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        } else if (i == 1) {
            return Math.max(arr[0], arr[1]);
        } else {
            int A = recOpt(arr, i - 2) + arr[i];
            int B = recOpt(arr, i - 1);
            return Math.max(A, B);
        }
    }

    private static int dp_opt(int[] arr) {

        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        } else if (arr.length == 0) {
            return 0;

        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] opt = new int[arr.length];
            opt[0] = arr[0];
            opt[1] = Math.max(arr[0], arr[1]);
            for (int i = 2; i < arr.length; i++) {
                int A = opt[i - 2] + arr[i];
                int B = opt[i - 1];
                opt[i] = Math.max(A, B);
            }
            return opt[arr.length - 1];
        }
    }

    /**
     * 若是变成一个环，把第一家和最后一家分别去掉，各算一遍能抢的最大值，然后比较两个值取其中较大的一个即为所求。
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] left = new int[nums.length - 1];
        int[] right = new int[nums.length - 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = nums[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = nums[i + 1];
        }
        return Math.max(dp_opt(left), dp_opt(right));
    }
}
