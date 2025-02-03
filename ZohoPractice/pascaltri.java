public class pascaltri {
    public static void main(String[] args) {
        pattern2("abcde");
    }

    private static void pattern(String string) {
        int len = string.length();
        int i = 0;
        int j = string.length() - 1;

        for (int k = 0; k <= len / 2; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print("  ");
            }
            if (i == j) {
                System.out.print(string.charAt(i));
                i++;
                j--;
            } else {
                System.out.print(string.charAt(i));

                for (int l = (len / 2 - k) * 2 - 1; l > 0; l -= 1) {

                    System.out.print("  ");
                }
                System.out.print(" ");
                System.out.print(string.charAt(j));
                i++;
                j--;

            }
            System.out.println();
            if (i > len || j < 0) {

                break;
            }

        }
        for (int k = len / 2 - 1; k >= 0; k--) {
            for (int l = k; l > 0; l--) {
                System.out.print("  ");
            }

            System.out.print(string.charAt(i));
            for (int l = 0; l <= (len / 2 - k) * 2 - 2; l += 1) {

                System.out.print("  ");
            }
            System.out.print(" ");
            System.out.print(string.charAt(j));
            i++;
            j--;

            System.out.println();
            if (i > len || j < 0) {

                break;
            }

        }
    }

    private static  void pattern2(String str){
        int n=str.length();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print(str.charAt(j));
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

}
