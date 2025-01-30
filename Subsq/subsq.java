import java.util.ArrayList;

public class subsq {
    public static void main(String[] args) {
        System.out.println(subsA("","abc"));
        subs("","abc");
    }
    
    static ArrayList<String> subsA(String recurString,String original){
        if(original.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(recurString);
            return list;
        }
        char ch=original.charAt(0);
        ArrayList<String> Left=subsA(recurString+ch,original.substring(1));
        ArrayList<String> Right=subsA(recurString,original.substring(1));
        Left.addAll(Right);
        return Left;
    }

    static void subs(String recurString,String original){
        if(original.isEmpty()){
            System.out.println(recurString);
            return;
        }
        char ch=original.charAt(0);
        subs(recurString+ch,original.substring(1));
        subs(recurString,original.substring(1));
    }
    
}
