package algorithm.array;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.array
 * @Description: TODO 有两个大小为 m 和 n 的排序数组 nums1 和 nums2 。
 * <p>
 * 请找出两个排序数组的中位数并且总的运行时间复杂度为 O(log (m+n)) 。
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 中位数是 2.0
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 中位数是 (2 + 3)/2 = 2.5
 * @date 2018/04/07 18:29
 */
public class Test1 {
    public static void main(String[] args) {
        int nums1[] = new int[]{};
        int nums2[] = new int[]{2, 3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        } else {
            int arr[] = new int[nums1.length + nums2.length];
            int i = 0;//第一个数组的游标
            int j = 0;//第二个数组的游标
            int a = 0;//结果数组的游标
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    arr[a] = nums1[i];
                    i++;
                } else {
                    arr[a] = nums2[j];
                    j++;
                }
                a++;
            }
            while (j < nums2.length) {
                arr[a] = nums2[j];
                j++;
                a++;
            }
            while (i < nums1.length) {
                arr[a] = nums1[i];
                i++;
                a++;
            }
            if (arr.length % 2 == 0) {
                return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
            } else {
                return arr[arr.length / 2];
            }
        }

    }
}
