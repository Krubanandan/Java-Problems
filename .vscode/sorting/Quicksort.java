import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] arr={2,6,7,1,3,9};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivotI=partition(arr,low,high);
            quicksort(arr,low,pivotI-1);
            quicksort(arr,pivotI+1,high);
        }
    }
    
    private static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        
        // int left=low;
        // int right=high;
        
        // while(left<right){
        //     while(arr[left]<=pivot && left<right){
        //         left++;
        //     }
            
        //     while(arr[right]>pivot && left<right){
        //         right--;
        //     }
        //     swap(arr,left,right);
        // }
        // swap(arr,left,high);
        
        // return right;

        int left=low-1;

        for(int right=low;right<high;right++){
            if(arr[right]<pivot){
                left++;
                swap(arr, left, right);
            }

        }

        swap(arr, left+1, high);
        
        return left+1;
    }
    
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}