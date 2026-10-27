class Solution {
    public int characterReplacement(String s, int k) {
        int ans = Integer.MIN_VALUE;
        int maxF = Integer.MIN_VALUE;
        int l = 0;
        Map<Character, Integer> curFreq = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            curFreq.put(s.charAt(r), curFreq.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, curFreq.get(s.charAt(r)));

            while ((r - l + 1) - maxF > k) {
                curFreq.put(s.charAt(l), curFreq.get(s.charAt(l)) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
