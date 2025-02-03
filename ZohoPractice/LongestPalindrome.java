public class LongestPalindrome {
    public static void main(String[] args) {
        String s="iutracecarmnb";
        System.out.println(palindromCheck(s));
    }

    private static int palindromCheck(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            int odd=checkString(s,i,false);
            int even=checkString(s,i,true);
            maxLen=Math.max(Math.max(odd,even),maxLen);

        }

        return maxLen;

    }
    

    private static int checkString(String s,int index,boolean condition){
        int len=0;
        int i=index-1;
        int j=condition==true?index:index+1;
        
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                len=Math.max(len, j-i+1);
            }
            i--;
            j++;
        }

        return len;
    } 

    
}

// private static int checkEven(String s, int index) {
//     int len=0;
//     int i=index-1;
//     int j=index;
    
//     while(i>=0 && j<s.length()){
//         if(s.charAt(i)==s.charAt(j)){
//             len=Math.max(len, j-i+1);
//         }
//         i--;
//         j++;
//     }

//     return len;
    
// }
