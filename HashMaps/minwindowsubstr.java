import java.util.HashMap;

public class minwindowsubstr {
    class Solution {
        public String minWindow(String s, String t) {
            int sLen = s.length();
            int tLen = t.length();
            if (sLen < tLen) {
                return "";
            }
            HashMap<Character, Integer> tCount = new HashMap<>();
            for (char c : t.toCharArray()) {
                tCount.put(c, tCount.getOrDefault(c, 0) + 1);
            }
            HashMap<Character, Integer> temp = new HashMap<>();
            int min = Integer.MAX_VALUE;
            int start = 0, end = 0;
            int left = 0;
            int right = 0;
            int match = 0;
            while (right < sLen) {
                char rC = s.charAt(right);
                if (tCount.containsKey(s.charAt(right))) {
                    temp.put(rC, temp.getOrDefault(rC, 0) + 1);
                    if (tCount.get(rC).equals(temp.get(rC))) {
                        match++;
                    }
                }

                while (match == tCount.size()) {

                    if (right - left + 1 < min) {
                        start = left;

                        min = right - left + 1;
                    }
                    char lC = s.charAt(left);

                    if (tCount.containsKey(lC)) {
                        if (tCount.get(lC).equals(temp.get(lC))) {
                            match--;
                        }
                        temp.put(lC, temp.get(lC) - 1);
                    }
                    left++;
                }
                right++;
            }
            return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);

        }
    }

}
