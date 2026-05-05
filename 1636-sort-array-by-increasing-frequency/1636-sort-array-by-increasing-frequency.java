import java.util.*;

class Solution {

    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert int[] to Integer[]
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {

            arr[i] = nums[i];
        }

        // Sort
        Arrays.sort(arr, (a, b) -> {

            if (map.get(a).equals(map.get(b))) {

                return b - a;
            }

            return map.get(a) - map.get(b);
        });

        // Convert back to int[]
        for (int i = 0; i < nums.length; i++) {

            nums[i] = arr[i];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 2, 3};

        Solution sol = new Solution();

        int[] result = sol.frequencySort(nums);

        for (int num : result) {

            System.out.print(num + " ");
        }
    }
}