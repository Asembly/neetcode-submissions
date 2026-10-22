class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1, r = nums.length - 1;
            while (r - l > 0) {
                int sum = nums[r] + nums[l] + nums[i];
                if (sum > 0)
                    r--;
                else if (sum < 0)
                    l++;
                else {
                    ans.add(List.of(nums[l], nums[r], nums[i]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                }

            }
        }

        return ans;
    }
}
