public class Permutes {
    public static void main(String[] args) {
        permute("abcd");
    }

    private static void permute(String string) {
        char[] arr=string.toCharArray();

        generatePermutations(arr,0);
    }

    private static void generatePermutations(char[] arr, int index) {
        if(index==arr.length){
            System.out.println(new String(arr));
            return ;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            // System.out.print(index);
            generatePermutations(arr, index+1);
            // System.out.print("HI");
            swap(arr, i, index);

        }
        
    }

    private static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 

}
