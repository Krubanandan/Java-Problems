import java.util.Arrays;


public class mergesort {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,9,2,3};
        int[] arr1=merge(arr);
        System.out.println(Arrays.toString(arr1));
    }
    
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        
        int mid=(arr.length)/2;
        
        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        
        return mergeA(left,right);
    }
    
    static int[] mergeA(int[] left,int[] right){
        int[] newA=new int[left.length+right.length];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                newA[k]=left[i];
                i++;
            }else{
                newA[k]=right[j];
                j++;
            }
            k++;
        }
        
        while(i<left.length){
            newA[k]=left[i];
            i++;
            k++;
        }
        
        while(j<right.length){
            newA[k]=right[j];
            j++;
            k++;
        }
        
        return newA;
        
    }
    
}
