import java.util.*;

class Solution {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // pointer for children
        int j = 0; // pointer for cookies
        int count = 0;

        while (i < g.length && j < s.length) {

            // If cookie satisfies child
            if (s[j] >= g[i]) {
                count++;
                i++; // move to next child
                j++; // move to next cookie
            } else {
                j++; // try bigger cookie
            }
        }

        return count;
    }
}