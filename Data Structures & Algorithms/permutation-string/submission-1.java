class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] permutFreq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            permutFreq[s1.charAt(i) - 'a']++;
        }

        for (int l = 0; l < s2.length(); l++) {
            if (permutFreq[s2.charAt(l) - 'a'] > 0) {
                int r = l;
                int[] curFreq = new int[26];
                int count = 0;
                while (r < s2.length()) {
                    var c = s2.charAt(r) - 'a';
                    curFreq[c]++;
                    if (curFreq[c] > permutFreq[c])
                        break;
                    r++;
                }
                if (r - l == s1.length())
                    return true;
            }
        }

        return false;
    }
}
