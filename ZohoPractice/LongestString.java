import java.util.Arrays;

public class LongestString {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            // System.out.println(s.charAt(right));
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)];
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left);
        }        
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
