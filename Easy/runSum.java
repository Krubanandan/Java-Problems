package easy;

import java.util.Arrays;

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int n=nums.length;
//         int[] newSums=new int[n];
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum+=nums[i];
//             newSums[i]=sum;

//         }

//         return newSums;
//     }
// }
public class runSum {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newSums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            newSums[i] = sum;

        }

        return newSums;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
       System.out.println(Arrays.toString(runningSum(nums)));
    }

}
