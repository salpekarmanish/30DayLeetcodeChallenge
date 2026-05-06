import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public char findTheDifference(String s, String t) {

        char[] sts = s.toCharArray();

        char[] st = t.toCharArray();

        Arrays.sort(sts);
        Arrays.sort(st);

        int i = 0;

        int j = 0;

        while (i < sts.length && j < st.length) {

            if (sts[i] == st[j]) {

                i++;
                j++;

            } else {

                return st[j];
            }
        }


        return st[st.length - 1];
    }

    public static void main(String[] args) {

        String s = "abcd";

        String t = "abcde";

        Solution sol = new Solution();

        char result = sol.findTheDifference(s, t);

        System.out.println(result);
    }
}