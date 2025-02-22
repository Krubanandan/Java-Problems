package practice;

public class StaticEx {
   
    public static void main(String[] args) {
        H h=new H();
        H h2=new H();
        System.out.println(x);
    }

}

class H{
    static int x=0;
    public H(){
        x++;
    }
}