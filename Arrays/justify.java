package arrays;

import java.util.ArrayList;
import java.util.List;

public class justify {

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case
        String[] words = {"This", "is", "an", "example", "of", "text", "justification"};
        int maxWidth = 16;
        
        List<String> result = solution.fullJustify(words, maxWidth);
        
        // Print the result
        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }

    // Inner Solution class
    public static class Solution {
        public List<String> fullJustify(String[] words, int maxWidth) {
            List<String> res = new ArrayList<>(); // Stores the result
            List<String> cur = new ArrayList<>(); // Stores the current line's words
            int num_of_letters = 0; // Tracks the total length of words in the current line

            for (String word : words) { // Iterate through each word
                if (word.length() + cur.size() + num_of_letters > maxWidth) { // Check if adding the current word exceeds maxWidth
                    // Distribute spaces (justifying the line)
                    int spaces = maxWidth - num_of_letters;
                    int gaps = cur.size() - 1;

                    if (gaps > 0) {
                        int spacePerGap = spaces / gaps;
                        int extraSpaces = spaces % gaps;

                        // Distribute spaces between words
                        StringBuilder line = new StringBuilder();
                        for (int i = 0; i < cur.size(); i++) {
                            line.append(cur.get(i));
                            if (i < gaps) {
                                int spaceCount = spacePerGap + (i < extraSpaces ? 1 : 0);
                                for (int j = 0; j < spaceCount; j++) {
                                    line.append(" ");
                                }
                            }
                        }
                        res.add(line.toString());
                    } else {
                        // Only one word in the line, just add spaces at the end
                        StringBuilder line = new StringBuilder(cur.get(0));
                        while (line.length() < maxWidth) {
                            line.append(" ");
                        }
                        res.add(line.toString());
                    }

                    cur.clear(); // Clear the current line
                    num_of_letters = 0; // Reset the number of letters
                }
                cur.add(word); // Add the word to the current line
                num_of_letters += word.length(); // Update the total number of letters
            }

            // Handle the last line (left-aligned with spaces at the end)
            StringBuilder lastLine = new StringBuilder();
            for (int i = 0; i < cur.size(); i++) {
                lastLine.append(cur.get(i));
                if (i != cur.size() - 1) lastLine.append(" ");
            }
            while (lastLine.length() < maxWidth) lastLine.append(" "); // Add spaces at the end to make the line exactly maxWidth
            res.add(lastLine.toString()); // Add the last line to the result

            return res; // Return the result list
        }
    }
}
