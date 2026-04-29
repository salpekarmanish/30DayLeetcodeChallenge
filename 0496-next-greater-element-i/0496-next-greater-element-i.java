import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Store next greater element for each number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Stack for finding next greater element
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            // If stack empty, no greater element
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            // Push current element
            stack.push(nums2[i]);
        }

        // Build answer array
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}