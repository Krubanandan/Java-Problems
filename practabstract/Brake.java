package practabstract;

public class Brake {
    static class H{
        int k=0;
    }
    public static void main(String[] args) {
        // Brake b=new Brake();
        Brake b=new Brake();
        Brake.H h=new Brake.H();

        int t=h.k;
        System.out.println(t);
        
    }
}
