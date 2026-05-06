import java.util.Arrays;

class Solution {

    public int[] findErrorNums(int[] nums) {

        int[] freq = new int[nums.length + 1];

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int duplicate = -1;
        int missing = -1;

        // Find duplicate and missing
        for (int i = 1; i <= nums.length; i++) {

            if (freq[i] == 2) {
                duplicate = i;
            }

            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {1,2,2,4};
        int[] nums2 = {1,1};

        System.out.println(Arrays.toString(sol.findErrorNums(nums1)));
        System.out.println(Arrays.toString(sol.findErrorNums(nums2)));
    }
}