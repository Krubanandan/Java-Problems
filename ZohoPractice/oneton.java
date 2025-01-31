public class oneton {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int i) {
        if(i==1){
            System.out.println(1);
            return;
        }
        System.out.println(i);
        print(i-1);
        
    }
}
