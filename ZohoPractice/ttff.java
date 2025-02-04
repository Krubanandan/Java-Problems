public class ttff {
    public static void main(String[] args) {
        int count = stepsCheck("TTFF");
        System.out.println(count);
    }

    private static int stepsCheck(String string) {

        return Math.max(stepsCheck(string, 'T', 2), stepsCheck(string, 'F', 2));
    }

    private static int stepsCheck(String string, char string2, int limit) {

        int count = 0;
        // int maxCount=0;
        int left = 0;
        // int right = 0;
        int limitCheck = 0;
        for (int right = 0; right < string.length(); right++) {
            if (string.charAt(right) != string2) {
                limitCheck++;
            }
            while (limitCheck > limit) {
                if (string.charAt(left) != string2) {
                    
                    limitCheck--;
                }
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }

}
