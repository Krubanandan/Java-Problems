package arrays;

public class candy {
    
    class Solution {
        public int candy(int[] ratings) {
            int[] resAr=new int[ratings.length];
            for(int i=0;i<resAr.length;i++){
                resAr[i]=1;
            }
            for(int i=0;i<resAr.length-1;i++){
                if(ratings[i]<ratings[i+1]){
                    resAr[i+1]=resAr[i]+1;
                }
            }
            for(int i=ratings.length-2;i>=0;i--){
                if(ratings[i]>ratings[i+1]){
                    resAr[i]=Math.max(resAr[i],resAr[i+1]+1);
                }
            }
            int sum=0;
            for(int a:resAr){
                sum+=a;
            }
    
            return sum;
            
        }
    }
}
