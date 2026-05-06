import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            arr[i] = Math.powExact(nums[i],2);
        }
        Arrays.sort(arr);

    return arr;}

    public static void main(String[] args) {

        int[] nums = {4,-1,0,3,10};

        Solution sol = new Solution();

        int[] result = sol.sortedSquares(nums);


        System.out.println(Arrays.toString(result));
    }
}