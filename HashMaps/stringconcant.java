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

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        HashMap<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;

   for (int i = 0; i <= s.length() - totalLen; i++) {
    HashMap<String, Integer> seen = new HashMap<>();
    int nMatch = 0;
    while (nMatch < words.length) {
        int start = i + nMatch * wordLen;
        int end = start + wordLen;
        String subStr = s.substring(start, end);
        if (wordsMap.containsKey(subStr)) {
            seen.put(subStr, seen.getOrDefault(subStr, 0) + 1);
            if (seen.get(subStr) > wordsMap.get(subStr)) {
                break;
            }
        } else {
            break;
        }
        nMatch++;
    }
    if (nMatch == words.length) {
        result.add(i);
    }
}



        return result;
    }
}