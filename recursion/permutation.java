package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 2, 3}; // Example input
        List<List<Integer>> result = solution.permute(nums);
        
        System.out.println("Permutations: " + result);
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) {
                    continue; // Skip already-used numbers
                }
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
