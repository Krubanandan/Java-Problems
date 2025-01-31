
import java.util.Arrays;
import java.util.Stack;

public class nextgreate {
    public static void main(String[] args) {
        int[] nums={4, 5, 2, 10, 8};
        int[] result=(nextG(nums));
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextG(int[] nums) {
        
        int[] res=new int[nums.length];
        Stack<Integer> temp=new Stack<>();

        for(int i=nums.length-1;i>=0;i--){
            if(!temp.isEmpty() && temp.peek()<=nums[i]){
                temp.pop();
            }

            res[i]=temp.isEmpty()?-1:temp.peek();
            temp.push(nums[i]);
        }

        return res;
    }
        
            
    
}
