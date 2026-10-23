class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int leftHeight = height[l], rightHeight = height[r];
        int totalAmount = 0;

        while (r > l) {
            if (leftHeight < rightHeight) {
                l++;
                leftHeight = Math.max(leftHeight, height[l]);
                totalAmount += leftHeight - height[l];
            } else {
                r--;
                rightHeight = Math.max(rightHeight, height[r]);
                totalAmount += rightHeight - height[r];
            }
        }

        return totalAmount;
    }
}
