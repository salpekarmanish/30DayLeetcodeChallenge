import java.util.*;

class Solution {

    // Function to find largest digit in a number
    public int maxDigit(int num) {

        int max = 0;

        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }

        return max;
    }

    public int maxSum(int[] nums) {

        int ans = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            int digit = maxDigit(num);

            
            if (map.containsKey(digit)) {

                ans = Math.max(ans, num + map.get(digit));

              
                map.put(digit, Math.max(map.get(digit), num));
            } 
            else {
                map.put(digit, num);
            }
        }

        return ans;
    }
}