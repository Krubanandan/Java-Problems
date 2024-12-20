package arrays;
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int len = height.length - 1;

        int maxWater = 0;

        while (i <= j) {
            int tempMax = (Math.min(height[i], height[j])) * (len);

            if (height[i] < height[j]) {
                i++;
                len--;
            } else if (height[i] == height[j]) {
                i++;
                j--;
                len -= 2;
            } else {
                j--;
                len--;
            }

            maxWater = Math.max(tempMax, maxWater);
        }

        return maxWater;
    }
}

public class containwater {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test case
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);

        System.out.println("The maximum area of water that can be contained is: " + result);
    }
    
}
