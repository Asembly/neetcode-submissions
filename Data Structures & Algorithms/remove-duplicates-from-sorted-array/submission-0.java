class Solution {
    public static int removeDuplicates(int[] nums) {
        int l = 0;
        int k = 0;
        while (l < nums.length) {
            int r = l + 1;
            while (r < nums.length && nums[l] == nums[r])
                r++;

            swap(nums, k, l);
            l = r;
            k++;
        }

        return k;
    }

    public static void swap(int[] nums, int i, int j) {
        int c = nums[i];
        nums[i] = nums[j];
        nums[j] = c;
    }
}