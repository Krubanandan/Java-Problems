public class tripattern {
    public static void main(String[] args) {
        patternPrint(5);
    }
    
    static  void patternPrint(int n){
        patternPrint(n, 1, 0, 0);
    }

    static void patternPrint(int n,int start,int end,int pow2){
        if(n==1){
            for (int i = 0; i < end; i++) {
                System.out.print("  ");
                
            }
            System.out.print(start);
            return;
        }
        int next=start+(int)Math.pow(2, pow2);
        int nextIterate=start+next;
        int newPower=pow2+1;
        int newEnd=end+1;
        patternPrint(n-1, nextIterate, newEnd, newPower);
        System.out.println();
        int temp=start;
        int power=(int)Math.pow(2, pow2);
        for (int i = 0; i < end; i++) {
            System.out.print("  ");
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp+" ");
            temp+=power;

        }

    }
}
