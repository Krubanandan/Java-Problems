import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 89, 72, 15, 5 };
        int[] arrSort=sortedMerge(arr);
        mergeInplace(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arrSort));   
        System.out.println(Arrays.toString(arr));  
    }

    private static  int[] sortedMerge(int[] arr) {
        if(arr.length<=1){
            return arr;
        }

        int mid=arr.length/2;
        
        int[] arr1 = Arrays.copyOfRange(arr, 0, mid);
        int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length);

        arr1 = sortedMerge(arr1); 
        arr2 = sortedMerge(arr2);

        int[] res = mergeAll(arr1, arr2);

        return res;

    }

    private static int[] mergeAll(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0;
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[index++] = arr1[i++];
                
            } else  {
                mergedArray[index++] = arr2[j++];
                
            }
            
        }

        while (i < arr1.length) {
            mergedArray[index++] = arr1[i++];           
        }

        while (j < arr2.length) {
            mergedArray[index++] = arr2[j++];   
        }

        return mergedArray;
    }



    private static void mergeInplace(int[] arr,int start,int end) {
        if(end-start<=1){
            return;
        }

        int mid=(start+end)/2;
        
        // int[] arr1 = Arrays.copyOfRange(arr, 0, mid);
        // int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length);

        mergeInplace(arr, start, mid); 
        mergeInplace(arr, mid+1, end);

        mergeAllIn(arr,start,mid,end);

        

    }

    private static void mergeAllIn(int[] arr1, int start, int mid, int end) {
        // int[] mergedArray = new int[arr1.length + arr2.length];

        int i = start, j = mid+1;

        while(i<=mid && j<=end){
            if(arr1[i]<=arr1[j]){
                i++;
            }else{
                int temp=arr1[j];
                System.arraycopy(arr1,i,arr1,i+1,j-i);
                arr1[i]=temp;

                i++;
                // mid++;
                j++;
            }
        }
        
    }


}
