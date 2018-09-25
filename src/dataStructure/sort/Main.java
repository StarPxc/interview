package dataStructure.sort;

/**
 * @author Ethanp
 * @version V1.0
 * @Package dataStructure.sort
 * @Description: TODO
 * @date 2018/3/30 21:02
 */
public class Main {
    public static void main(String[] args) {
        final int N = 10;
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 1000);
        }
        quickSort(nums, 0, nums.length - 1);
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + "\t");
        }
    }

    public static void quickSort(int a[], int l, int r) {
        int i = l;
        int j = r;
        int key = a[l];
        while (l < r) {
            while (l < r && a[r] > key) {
                r--;
            }
            while (l < r && a[l] < key) {
                l++;
            }
            if (l < r) {//交换
                int p = a[l];
                a[l] = a[r];
                a[r] = p;
            }

        }
        int temp = a[i];
        a[i] = a[l];
        a[l] = temp;
        quickSort(a, i, l - 1);
        quickSort(a, l + 1, r);
    }
}
