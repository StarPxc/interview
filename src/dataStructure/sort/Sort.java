package dataStructure.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by PXC on 2017/7/24.
 */
public class Sort {
    /**
     * @Author Ethan
     * @Date 2017/7/24 14:26
     * @Description 发牌算法
     */
    @Test
    public void card() {
        int arrs[] = new int[52];
        String[] cardColors = {"黑桃", "红桃", "方块", "红心"};
        String[] cardNum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = i;
        }
        for (int i = 0; i < arrs.length; i++) {
            int r = (int) (Math.random() * 52);
            int temp = arrs[r];
            arrs[r] = arrs[i];
            arrs[i] = temp;
        }
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(cardNum[arrs[i] % 13] + ":" + cardColors[arrs[i] / 13]);
            if ((i + 1) % 13 == 0) {
                System.out.println();
            } else {
                System.out.print(",");
            }
        }
    }

    /**
     * @Author Ethan
     * @Date 2017/7/24 14:27
     * @Description 选择排序
     * 每一轮里面选最小的值和第i个元素交换
     */
    @Test
    public void selectSort() {
        final int N = 10;
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < N; i++) {
            //最小值的下表
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;


        }

    }

    /**
     * @Author Ethan
     * @Date 2017/7/27 19:50
     * @Description 快速排序
     */
    private static  void quickSort(int[] a, int low, int high) {
        //1,找到递归算法的出口
        if (low > high) {
            return;
        }
        //2, 存
        int i = low;
        int j = high;
        //3,key
        int key = a[low];
        //4，完成一趟排序
        while (i < j) {
            //4.1 ，从右往左找到第一个小于key的数
            while ( i<j&&a[j] > key) {
                j--;
            }
            // 4.2 从左往右找到第一个大于key的数
            while (i<j&& a[i] <= key) {
                i++;
            }
            //4.3 交换
            if (i < j) {
                int p = a[i];
                a[i] = a[j];
                a[j] = p;
            }
        }
        // 4.4，调整key的位置
        int p = a[i];
        a[i] = a[low];
        a[low] = p;
        //5, 对key左边的数快排
        quickSort(a, low, i - 1);
        //6, 对key右边的数快排
        quickSort(a, i + 1, high);
    }

    @Test
    public void fastSort() {
        final int N = 700;
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 1000);
        }

        long begin = System.currentTimeMillis();
        quickSort(nums, 0, nums.length - 1);
        long after = System.currentTimeMillis();
        System.out.println(after - begin);
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + "\t");
        }
    }

    /**
     * @Author Ethan
     * @Date 2017/7/24 19:46
     * @Description 二分查找
     */
    @Test
    public void binarySort() {

        int nums[] = {2, 5, 8, 10, 15, 25, 35, 45, 55, 65, 75, 85};

        int searchNum = 10;
        boolean isFound = false;
        int low = 0;//下界下表
        int high = nums.length - 1;//上届下标
        //二分查找不知道要查找多少次
        while (high >= low) {
            //计算中点下标
            int mid = (low + high) / 2;
            //如果searchNum小于之间元素
            if (searchNum < nums[mid]) {
                high = mid - 1;
            } else if (searchNum > nums[mid]) {
                low = mid + 1;
            } else if (searchNum == nums[mid]) {
                System.out.println("找到了了数字，下标为：" + mid);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("没有找到");
        }


        long begin = System.currentTimeMillis();

    }


    /**
     * 给定由大写，小写字母和空格组成的字符串，返回 最后 一个单词的长度。
     * 如果输入中不存在单词，返回 0。
     */
    @Test
    public void pxc1() {
        Scanner console = new Scanner(System.in);
        String input = console.next();
        String strs[] = input.split(" ");

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

    }

    /**
     * 冒泡排序
     */
    @Test
    public void bubble() {
        long temp = 0;
        long[] arr = new long[]{1, 8, 63, 92, 5, 25};
        //第几趟
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    /**
     * 插入排序
     */

    @Test
    public void insertSort() {
        int[] arr = new int[]{15, 8, 69, 23, 23, 2, 34, 53, 69, 3, 45};
        int i, j;
        int n = arr.length;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < n; i++) {
            j = i;
            target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                //后移一位
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;

        }
        System.out.println(Arrays.toString(arr));


    }


}
