class Solution {
    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;

        int[] prefix = new int[n + 1];
        int[] postfix = new int[n + 1];

        prefix[0] = 1;
        postfix[n] = 1;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i];
        }

        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i] * postfix[i + 1];
        }

        return ans; 
    }
}  
