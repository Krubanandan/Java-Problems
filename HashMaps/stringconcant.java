import java.util.*;

public class stringconcant {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        List<Integer> result = solution.findSubstring(s, words);
        
        System.out.println("Result: " + result);
    }

    static class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            Map<String, Integer> wordFrequency = new HashMap<>();
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            List<Integer> resultIndexes = new ArrayList<>();
            int stringLength = s.length();
            int totalWords = words.length;
            int wordLength = words[0].length();
            int totalSubstringLength = totalWords * wordLength;

            for (int start = 0; start <= stringLength - totalSubstringLength; start++) {
                Map<String, Integer> seenWords = new HashMap<>();
                int matchedWords = 0;

                while (matchedWords < totalWords) {
                    int wordStartIndex = start + matchedWords * wordLength;
                    int wordEndIndex = wordStartIndex + wordLength;

                    String currentWord = s.substring(wordStartIndex, wordEndIndex);

                    if (wordFrequency.containsKey(currentWord)) {
                        seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);

                        if (seenWords.get(currentWord) > wordFrequency.get(currentWord)) {
                            break;
                        }
                    } else {
                        break;
                    }

                    matchedWords++;
                }

                if (matchedWords == totalWords) {
                    resultIndexes.add(start);
                }
            }

            return resultIndexes;
        }
    }
}
