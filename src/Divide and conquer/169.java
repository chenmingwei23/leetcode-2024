class Solution {
    public int majorityElement(int[] nums) {
        int max = 1;
        int res = nums[0];
        Map<Integer, Integer> occurance = new HashMap<>();

        for (int i : nums) {
            if (occurance.containsKey(i)) {
                int currentOccurance = occurance.get(i) + 1;
                occurance.put(i, currentOccurance);

                if (currentOccurance > max) {
                    max = currentOccurance;
                    if (max > nums.length/2) {
                        return i;
                    }
                    res = i;
                }
            }
            else {
                occurance.put(i, 1);
            }
        }

        return res;
    }
}