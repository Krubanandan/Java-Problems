//largest sum of two consecutive numbers 
public class largesum {
    public static void main(String[] args) {
        int[] nums={0,-1,5,1,6,0,0,9,5};
        System.out.println(largestContigous(nums));
    }
    
    static int largestContigous(int[] nums){
        int res=0;
        
        for(int i=0;i<nums.length-1;i++){
            res=Math.max(res,nums[i]+nums[i+1]);
        }
        
        return res;
    }
    
}
