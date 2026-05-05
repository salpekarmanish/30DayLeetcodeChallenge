import java.util.ArrayList;
import java.util.List;

class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumAlice = 0;
        int sumBob = 0;

        for (int a : aliceSizes) {
            sumAlice += a;
        }

        for (int b : bobSizes) {
            sumBob += b;
        }

        int target = (sumAlice - sumBob) / 2;

        List<Integer> list = new ArrayList<>();

        for (int a : aliceSizes) {

            for (int b : bobSizes) {

                if (a - b == target) {

                    list.add(a);

                    list.add(b);
                }
            }
        }

        int[] result = new int[2];

        result[0] = list.get(0);

        result[1] = list.get(1);

        return result;
    }

    public static void main(String[] args) {

        int[] aliceSizes = {1, 1};

        int[] bobSizes = {2, 2};

        Solution sol = new Solution();

        int[] result = sol.fairCandySwap(aliceSizes, bobSizes);

        System.out.println(result[0] + " " + result[1]);
    }
}