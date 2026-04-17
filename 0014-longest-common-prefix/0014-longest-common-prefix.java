import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);  // 🔥 important

        String str = strs[0];
        String str1 = strs[strs.length - 1];

        int index = 0;

        while (index < str.length() && index < str1.length()) {
            if (str.charAt(index) == str1.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return index == 0 ? "" : str.substring(0, index);
    }

    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        Solution sol = new Solution();

        String result = sol.longestCommonPrefix(strs);
        System.out.println(result);
    }
}