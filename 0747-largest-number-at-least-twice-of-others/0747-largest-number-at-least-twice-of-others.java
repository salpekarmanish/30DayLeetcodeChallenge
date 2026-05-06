import java.util.*;

class Solution {

    public int dominantIndex(int[] nums) {
        int max = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[max] < nums[i]) {
                max = i;
            }
        }

        for (int j = 0; j < nums.length; j++) {

            if (j != max && nums[max] < 2 * nums[j]) {

                return -1;
            }
        }

        return max;
    }



    public static void main(String[] args) {

        int [] nums = {3,6,1,0};

        Solution sol = new Solution();

        int result = sol.dominantIndex(nums);

          System.out.println(result);
    }
}