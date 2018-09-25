package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 全排列算法
 * @date 2018/4/8 20:38
 */
public class Test12 {
    public static void main(String[] args) {
        String test = "4505";
        char arr[] = test.toCharArray();
        perm(arr, 0, arr.length - 1);
    }

    private static void perm(char[] arr, int p, int q) {
        //循环结束打印数组
        if (p == q) {
            for (char x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        for (int i = p; i <= q; i++) {
            if (isSwap(arr, p, q)) {

                swap(arr, p, i);
                perm(arr, p + 1, q);
                swap(arr, p, i);
            }

        }
    }

    //交换
    private static boolean isSwap(char[] arr, int p, int q) {
        for (int i = p + 1; i <= q; i++) {
            if (arr[i] == arr[p])
                return false;
        }
        return true;
    }

    //去重
    private static void swap(char[] arr, int p, int i) {
        char temp = arr[p];
        arr[p] = arr[i];
        arr[i] = temp;
    }
}
