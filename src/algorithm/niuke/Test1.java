package algorithm.niuke;

/**
 * Create by Ethan on 2017/11/2
 * 给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，左部分A[0..K]，右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，最大是多少？
 * 给定整数数组A和数组的大小n，请返回题目所求的答案。
 * 测试样例：
 * [2,7,3,1,1],5
 * 返回：6
 * <p>
 * <p>
 * <p>
 * 解析：
 * //首先找到最大值以及最大值所在的位置pos：
 * //1.如果pos=0，那么最大差值肯定是A[[0]-A[n-1]，因为左部分最大值必然是A[0]，
 * //右部分必然要包含A[n-1]，那么右部分最大值只会>=A[n-1]
 * //2.如果pos=n-1，那么最大差值肯定是A[n-1]-A[0]，道理和1一样
 */
public class Test1 {
    public int findMaxGap(int[] A, int n) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) max = A[i];
        }
        return max - Math.min(A[0], A[n - 1]);
    }

    public static void main(String[] args) {

    }
}
