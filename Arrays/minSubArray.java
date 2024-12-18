package arrays;

public class minSubArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int target = 7; // Example target sum
        int[] nums = {2, 3, 1, 2, 4, 3}; // Example input array
        
        int result = solution.minSubArrayLen(target, nums);
        System.out.println("Minimum Subarray Length: " + result);
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                if (i - j + 1 < minLen) {
                    minLen = i - j + 1;
                }
                sum -= nums[j];
                j++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}
