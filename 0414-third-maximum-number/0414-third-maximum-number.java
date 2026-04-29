class Solution {

    public int thirdMax(int[] nums) {

        List<Integer> list = new ArrayList<>();

        // Add elements
        for (int i = 0; i < nums.length; i++) {

            // Avoid duplicates
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        if (list.size() < 3) {
            return list.get(0);
        }

        int i = 0;

        int Fmax = 0;
        int Smax = 0;
        int Tmax = 0;

        while (i < list.size()) {

            if (i == 0) {
                Fmax = list.get(i);
            }

            else if (i == 1) {
                Smax = list.get(i);
            }

            else if (i == 2) {
                Tmax = list.get(i);
            }

            i++;
        }

        return Tmax;
    }
}