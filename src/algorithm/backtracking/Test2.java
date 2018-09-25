package algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.backtracking
 * @Description: TODO
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * @date 2018/4/21 9:15
 */
public class Test2 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    private static void getResult(List<List<Integer>> result, ArrayList<Integer> current, int[] candidates, int target,
                                  int start) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
            current.add(candidates[i]);
            getResult(result, current, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        System.out.println(combinationSum(nums, 7));
    }
}
