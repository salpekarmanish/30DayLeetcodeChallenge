import java.util.*;

class Solution {

    public int countElements(int[] nums) {
       
         Arrays.sort(nums);
        int count = 0;
        int min = nums[0];
        int n =nums.length;
        int max = nums[n-1];

        for(int i =0;i<nums.length;i++){
            if(min<nums[i]&& max>nums[i]){
                count++;
            }

        }


    return count;}



    public static void main(String[] args) {

        int [] nums = {11,7,2,15};

        Solution sol = new Solution();

        int result = sol.countElements(nums);

          System.out.println(result);
    }
}