import java.util.ArrayList;
import java.util.List;

public class P3LongestSubstringNoRepeats {
    
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        int maxSubstringLength = 0;
        for (int i = 0; i < chars.length; i++) {
            int subStringLength = 0;
            List<Character> seen = new ArrayList<>();
            for (int j = i; j < chars.length; j++) {
                if (seen.contains(chars[j])) {
                    break;
                }
    
                seen.add(chars[j]);
                subStringLength++;
            }

            maxSubstringLength = Math.max(maxSubstringLength, subStringLength);
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdaabs"));
    }
}
