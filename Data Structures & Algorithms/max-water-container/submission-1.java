class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int currentWidth = heights.length - 1;
        int maxVolume = 0;
        while (r - l > 0) {
            int minHeight = Math.min(heights[l], heights[r]);
            maxVolume = Math.max(maxVolume, minHeight * currentWidth);

            if (heights[l] < heights[r])
                l++;
            else
                r--;

            currentWidth--;
        }

        return maxVolume; 
    }
}
