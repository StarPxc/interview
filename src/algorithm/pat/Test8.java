package algorithm.pat;

/**
 * Create by Ethan on 2017/11/7
 * 春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
 * 给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
 * 若没有金额超过总数的一半，返回0。
 * 测试样例：
 * [1,2,3,2,2],5
 * 返回：2* 对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
 * 给定一个整数数组A及它的大小n，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，返回-1。若该元素出现多次，请返回第一次出现的位置。
 * 测试样例：
 * [1,3,5,7,9],5,3
 * 返回：1
 */
public class Test8 {
    public int getValue(int[] gifts, int n) {
        int count = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                a = gifts[i];
            } else {
                if (a == gifts[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (a == gifts[i])
                count++;
        }
        if (count * 2 > n)
            return a;
        return 0;

    }
}
