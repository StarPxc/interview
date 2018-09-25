package algorithm.dp;

/**
 * @author 浦希成
 * 2018/9/22 20:55
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）
 */
public class Test13 {
    public static void main(String[] args) {

    }
    private static int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tmp = max;
            max = Math.max(Math.max(nums[i], max*nums[i]), min*nums[i]);
            min = Math.min(Math.min(nums[i], tmp*nums[i]), min*nums[i]);
            if(res < max) {
                res = max;
            }
        }
        return res;

    }

}
