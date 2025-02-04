
import java.util.ArrayList;

public class abcDigit {
    public static void main(String[] args) {
        System.out.println(stringCheck(new int[]{1,2,1}));
    }

    private static int stringCheck(int[] arr) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> tempR=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            tempR.add(arr[i]);
        }
        res.add(tempR);
        for(int i=0;i<arr.length-1;i++){
            int tempI=0;
            int j=i;
            ArrayList<Integer> temp=new ArrayList<>();
            while (tempI<i) { 
                temp.add(arr[tempI]);
                tempI++;
            }
            // System.out.println(temp);
            while(j<arr.length-1){
                int digit=arr[j]*10+arr[j+1];
                if(digit<=26){
                    temp.add(digit);
                    j+=2;
                }else{
                    break;
                }
            }

            while(j<arr.length){
                temp.add(arr[j]);
                j++;
            }
            
            res.add(temp);
        }

        System.out.println(res);
        return res.size();

    }

}
