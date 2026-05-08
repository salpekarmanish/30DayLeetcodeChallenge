import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int[] sortArrayByParity(int[] num) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                list.add(num[i]);
            }
        }


        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                list.add(num[i]);
            }
        }

        for(int i =0;i<list.size();i++){
             num[i]=list.get(i);
        }
        return num;
    }

    public static void main(String[] args) {

        int[] num = {3,1,2,4};

        Solution sol = new Solution();

        int[] result = sol.sortArrayByParity(num);

        System.out.println(Arrays.toString(result));
    }
}