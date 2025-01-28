import java.util.Arrays;

public class mergeinplace {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,9,2,3};
        merge(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void merge(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        
        int mid=(end+start)/2;
        
        merge(arr,start,mid);
        merge(arr,mid,end);
        
        mergeA(arr,start,end,mid);
    }
    
    static void mergeA(int[] arr,int start,int end,int mid){
        int[] newA=new int[end-start];
        
        int i=start;
        int j=mid;
        int k=0;
        
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                newA[k]=arr[i];
                i++;
            }else{
                newA[k]=arr[j];
                j++;
            }
            k++;
        }
        
        while(i<mid){
            newA[k]=arr[i];
            i++;
            k++;
        }
        
        while(j<end){
            newA[k]=arr[j];
            j++;
            k++;
        }
        
        for(int l=0;l<newA.length;l++){
            arr[start+l]=newA[l];
        }
        
    }
    
}
