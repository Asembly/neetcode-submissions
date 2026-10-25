class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[255];
        int l = 0, r = 0;

        int maxLength = Integer.MIN_VALUE;
        while (r < s.length()) {
            freq[s.charAt(r)]++;
            if (freq[s.charAt(r)] > 1) {
                while(l < s.length() && freq[s.charAt(r)] > 1) {
                    freq[s.charAt(l)]--;
                    l++;
                }
            }

            maxLength = Math.max(maxLength, (r - l) + 1);

            r++;
        }

        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}
