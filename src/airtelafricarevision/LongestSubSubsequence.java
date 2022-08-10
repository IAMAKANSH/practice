package airtelafricarevision;

import java.util.HashMap;
import java.util.Map;

public class LongestSubSubsequence {

    public static void main(String[] args) {

        String given="abcdb";
        Integer max=longestSubSequence(given);
        System.out.println(max);
    }

    private static Integer longestSubSequence(String given) {
        int start = 0;
        int max = 0;
        Map<Character, Integer> seen = new HashMap<>();
        /**
         *      x        y        z           x               p
         *
         *  start=0
         *      i=0
         *
         *   x:0
         *   y:1
         *   z:2
         *
         */
        for (int i = 0; i < given.length(); i++) {
            if (seen.containsKey(given.charAt(i))) {
                start = Math.max(start, seen.get(given.charAt(i)) + 1);
            }
            max = Math.max(max, i - start + 1);
            seen.put(given.charAt(i), i);
        }
        return max;
    }
}
