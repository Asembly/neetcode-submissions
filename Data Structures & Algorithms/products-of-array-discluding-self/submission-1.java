class Solution {
    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;
        int product = 1;
        int wihoutZero = 1;
        int countZeros = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                countZeros++;
            wihoutZero *= nums[i] != 0 ? nums[i] : 1;
            product *= nums[i];
        }

        int[] ans = new int[n];
        if (countZeros > 1)
            return ans;

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i] != 0 ? (product / nums[i]) : wihoutZero;
        }

        return ans;
    }
}  
