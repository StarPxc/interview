package algorithm.dp;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.dp
 * @Description: TODO 最长回文【子序列】(不连续)
 * @date 2018/4/6 8:43
 */
public class Test4 {
    public static void main(String[] args) {
        String str = "abcda";
        char[] arr = str.toCharArray();
        System.out.println(lpsLen(arr, 0, arr.length - 1));
    }

    /**
     * 求子序列
     *
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private static String lpsStr(char[] arr, int l, int r) {
        if (l == r) {
            return arr[l] + "";
        } else if (l > r) {
            return "";
        } else if (arr[l] != arr[r]) {
            String A = lpsStr(arr, l + 1, r);
            String B = lpsStr(arr, l, r - 1);
            int max = Math.max(A.length(), B.length());
            return max == A.length() ? A : B;
        } else {
            return arr[l] + lpsStr(arr, l + 1, r - 1) + arr[r];
        }
    }

    /**
     * 求子序列长度
     *
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private static int lpsLen(char arr[], int l, int r) {
        if (l == r) {
            return 1;
        } else if (l > r) {
            return 0;
        } else if (arr[l] == arr[r]) {
            return lpsLen(arr, l + 1, r - 1) + 2;
        } else {
            int A = lpsLen(arr, l + 1, r);
            int B = lpsLen(arr, l, r - 1);
            return Math.max(A, B);
        }
    }


}
