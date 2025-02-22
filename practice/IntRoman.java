public class IntRoman {
    public static void main(String[] args) {
        
        System.out.println(intToRoman(9));

    }

    static String intToRoman(int n){
        StringBuilder sb=new StringBuilder();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int idx = 0; idx < values.length; idx++) {
            while(n>=values[idx]){
                sb.append(symbols[idx]);
                n-=values[idx];

            }
        }


        return sb.toString();

    }
}
