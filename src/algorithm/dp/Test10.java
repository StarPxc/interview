package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.
 * nums = [1, 2, 3]
 * target = 4
 * <p>
 * The possible combination ways are:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (3, 1)
 * (2, 2)
 * <p>
 * Note that different sequences are counted as different combinations.
 * <p>
 * Therefore the output is 7.
 * @date 2018/4/7 8:57
 */
//还是不懂为什么
//comb[target] = sum(comb[target - nums[i]]), where 0 <= i < nums.length, and target >= nums[i].
public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(combinationSum4(arr, 4));
    }

    public static int combinationSum4(int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += combinationSum4(nums, target - nums[i]);
            }
        }
        return res;
    }

}
