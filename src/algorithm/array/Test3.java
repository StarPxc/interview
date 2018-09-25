package algorithm.array;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.array
 * @Description: TODO
 * 给定一个有序数组，你需要原地删除其中的重复内容，使每个元素只出现一次,并返回新的长度。
 * <p>
 * 不要另外定义一个数组，您必须通过用 O(1) 额外内存原地修改输入的数组来做到这一点。
 * 给定数组: nums = [1,1,2],
 * <p>
 * 你的函数应该返回新长度 2, 并且原数组nums的前两个元素必须是1和2
 * 不需要理会新的数组长度后面的元素
 * @date 2018/04/07 19:59
 */
public class Test3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2,6,7,8,8};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[result]) {
                result++;
                nums[result] = nums[i];
            }
        }
        result++;
        for (int i = 0; i <result ; i++) {
            System.out.print(nums[i]+",");
        }
        return result;
    }

}
