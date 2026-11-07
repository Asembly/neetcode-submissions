class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int top = -1, bottom = matrix.length;

        while (bottom - top > 1) {
            int mid = top + (bottom - top) / 2;

            if (matrix[mid][matrix[0].length - 1] >= target) {
                bottom = mid;
            } else
                top = mid;
        }

        if (bottom == matrix.length)
            return false;

        int l = -1, r = matrix[0].length;
        while (r - l > 1) {
            int mid = l + (r - l) / 2;
            if (matrix[bottom][mid] >= target)
                r = mid;
            else
                l = mid;
        }

        return (r != matrix[0].length && matrix[bottom][r] == target);
    }
}
