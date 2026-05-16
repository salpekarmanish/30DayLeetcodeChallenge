class Solution {

    public boolean isCovered(int[][] ranges, int left, int right) {

        // Difference array
        int[] diff = new int[52];

        // Mark ranges
        for (int[] range : ranges) {

            int start = range[0];
            int end = range[1];

            diff[start]++;

            diff[end + 1]--;
        }

        // Prefix sum
        int prefix = 0;

        for (int i = 1; i <= 50; i++) {

            prefix += diff[i];

            // Check coverage
            if (i >= left && i <= right && prefix <= 0) {

                return false;
            }
        }

        return true;
    }
}