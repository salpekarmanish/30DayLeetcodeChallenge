import java.util.*;

class Solution {

    public String[] findRelativeRanks(int[] score) {

        int[] nums = score.clone();

        Arrays.sort(nums);

        Map<Integer, String> map = new HashMap<>();

        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1) {

                map.put(nums[i], "Gold Medal");

            } else if (i == n - 2) {

                map.put(nums[i], "Silver Medal");

            } else if (i == n - 3) {

                map.put(nums[i], "Bronze Medal");

            } else {

                map.put(nums[i], String.valueOf(n - i));
            }
        }

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {

            result[i] = map.get(score[i]);
        }

        return result;
    }
}

