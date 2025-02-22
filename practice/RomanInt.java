public class RomanInt{
    public static void main(String[] args) {
        System.out.println(romanInt("IX"));
    }
    
    static int romanInt(String str){
        int res=0;
        int prev=0;
        
        for(int i=str.length()-1;i>=0;i--){
            int digit=chars(str.charAt(i));
            
            if(prev>digit){
                res-=digit;
            }else{
                res+=digit;
            }
            
            prev=digit;
        }
        
        return res;
        
    }
    
    static int chars(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral");
        }
    }
}