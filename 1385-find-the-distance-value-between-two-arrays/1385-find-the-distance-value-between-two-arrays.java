class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int i = 0;

        int count = 0;

        while (i < arr1.length) {

            int j = 0;

            boolean found = false;

            while (j < arr2.length) {

                if (Math.abs(arr1[i] - arr2[j]) <= d) {

                    found = true;

                    break;
                }

                j++;
            }

            if (!found) {

                count++;
            }

            i++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 8};

        int[] arr2 = {10, 9, 1, 8};

        int d = 2;

        Solution sol = new Solution();

        int result = sol.findTheDistanceValue(arr1, arr2, d);

        System.out.println(result);
    }
}