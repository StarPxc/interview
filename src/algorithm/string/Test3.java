package algorithm.string;

/**
 * @author 浦希成
 * 2018/9/23 14:06
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 */
public class Test3 {
    int count = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            helper(s, i, i);
            helper(s, i, i + 1);
        }
        return count;
    }

    private void helper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }


}
