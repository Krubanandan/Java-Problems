import java.util.ArrayList;

public class colorTriangle {
    public static void main(String[] args) {
        int red = 2;
        int blue = 1;
        System.out.println(colorMax(red, blue));
    }

    private static int colorMax(int red, int blue) {
        return Math.max(colorMax(red, blue, true), colorMax(red, blue, false));
    }

    private static int colorMax(int red, int blue, boolean b) {
        int[] color=b?new int[]{red,blue}:new int[]{blue,red};
        int max=color[0]+color[1];
        int count=0;
        int sum=0;
        for(int i=1;sum+i<=max;i++){
            sum+=i;
            count++;
        }
        ArrayList<Integer> res=new ArrayList<>();
        boolean bool=true;
        for(int i=1;i<=count;i++){
            int index=bool==true?0:1;
            if(color[index]>=i){
                res.add(i);
                color[index]-=i;
            }else{
                break;
            }
            bool=!bool;

        }
        System.out.println(res);
        return res.size();
    }

}
