import java.util.*;

public class KthDistinctString {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> freq = new LinkedHashMap<>();  

        // Counting frequency of each string in the array
        for (String s : arr) {
            if (freq.containsKey(s)) {
                freq.put(s, freq.get(s) + 1);
            } else {
                freq.put(s, 1);
            }
        }    

        int target = 1;  // We're looking for strings that appear exactly once

        List<String> Dist = new ArrayList<>();

        // Loop through the frequency map and collect distinct strings
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == target) {
                Dist.add(entry.getKey());
            }
        }

        // If there are enough distinct strings, return the k-th one
        if (Dist.size() >= k) {
            return Dist.get(k - 1);  // 1-based index
        }

        // If not enough distinct strings, return an empty string
        return "";
    }

    public static void main(String[] args) {
        KthDistinctString solution = new KthDistinctString();
        
        // Example usage
        String[] arr = {"d", "b", "c", "d", "c","b","a","e"};
        int k = 2;
        System.out.println(solution.kthDistinct(arr, k));  // Output should be "a"
    }
}
