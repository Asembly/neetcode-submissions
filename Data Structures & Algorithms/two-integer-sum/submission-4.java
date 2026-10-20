class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            freq.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (freq.containsKey(need) && freq.get(need) != i) {
                return new int[] { i, freq.get(need) };
            }
        }

        return new int[0];
    }
}
