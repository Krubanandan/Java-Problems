import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tempR=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        res.add(Arrays.asList(1));
        if(numRows==1){
            return res;
        }
        res.add(Arrays.asList(1, 1));
        if(numRows==2){
            return res;
        }
        for(int i=3;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            int index=0;
            for(int j=1;j<=i;i++){
                if(j==1 || j==i){
                    temp.add(1);
                }else{
                    temp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }

        }

        return res;
    

    }
}
