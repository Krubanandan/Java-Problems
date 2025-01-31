public class permuteStr {
    private static void recurPermute(int index, char[] arr) {
        if (index == arr.length) {
            // copy the ds to ans
            System.out.println(new String(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            
            recurPermute(index + 1, arr);
            
            swap(i, index, arr);
            
        }
    }
    private static void swap(int i, int j, char[] nums) {
        char t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    
    public static void permute(String str) {
        char[] arr=str.toCharArray();
        recurPermute(0, arr);
        
    }



    public static void main(String[] args) {
        String s="abc";
        permute(s);

    }
    
}
