package hashmaps;

import java.util.HashMap;

public class ransomnote {

    // Method to check if ransomNote can be constructed from magazine
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> strRan = new HashMap<>();

        // Build the frequency map for magazine
        for (char c : magazine.toCharArray()) {
            strRan.put(c, strRan.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!strRan.containsKey(c) || strRan.get(c) <= 0) {
                return false;
            }
            strRan.put(c, strRan.get(c) - 1);
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println(result);
    }
}
