package algorithm.array;

/**
 * @author 浦希成
 * 2018/9/22 15:53
 * {6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Test7 {
    public static void main(String[] args) {
        int array[]=new int[]{6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
    private static int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            sum = Math.max(sum+array[i],array[i]);
            if(sum >= max) {
                max = sum;
            }
        }
        return max;


    }
}
