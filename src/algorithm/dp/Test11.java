package algorithm.dp;

import java.util.Arrays;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 分糖果
 * @date 2018/4/7 15:18
 */
public class Test11 {
    public static int candy(int[] ratings) {
        if (ratings.length < 1) {
            return 0;
        }
        int arr[] = new int[ratings.length];
        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length - 1; i++) {//从左到右扫一遍
            if (ratings[i + 1] > ratings[i]) {
                arr[i + 1] = arr[i] + 1;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {//从右到左扫一遍
            if (ratings[i - 1] > ratings[i]) {
                arr[i - 1] = Math.max(arr[i - 1], arr[i] + 1);//注意
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int rating[] = new int[]{2, 3, 2};
        System.out.println(candy(rating));
    }
}
