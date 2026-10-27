class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }

        int ans = Integer.MIN_VALUE;
        for (var c : chars) {

            int count = 0, l = 0;
            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c)
                    count++;

                while ((r - l + 1) - count > k) {
                    if (s.charAt(l) == c)
                        count--;
                    l++;
                }

                ans = Math.max(ans, r - l + 1);
            }

        }

        return ans;
    }
}
