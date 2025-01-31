public class fibo {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print(fibonacci(i)+" ");
            
        }
        
    }

    private static int fibonacci(int i) {
        if(i==0 ){
            return 0;
        }
        if(i==2 || i==1){
            return 1;
        }
        

        return fibonacci(i-1)+fibonacci(i-2);
        
    }

}
