class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            uniqueNumbers.add(nums[i]);

        if(uniqueNumbers.size() != nums.length)
            return true;
        return false;
    }
}