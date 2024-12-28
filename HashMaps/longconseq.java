import java.util.*;

public class longconseq {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> setNum = new HashSet<>();

            if (nums.length == 0) {
                return 0;
            }

            for (int num : nums) {
                setNum.add(num);
            }
            int count = 1;

            for (int num : nums) {
                if (!setNum.contains(num - 1)) {
                    int tCount = 1;
                    int temp = num;
                    while (setNum.contains(temp + 1)) {
                        tCount++;
                        temp = temp + 1;
                    }
                    count = Math.max(tCount, count);
                }
            }
            return count;
        }
    }

}
