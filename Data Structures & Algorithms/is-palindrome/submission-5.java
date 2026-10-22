class Solution {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();

        int l = 0, r = s.length() - 1;
        while (r - l > 0) {
            while (l < r && !alphaNum(s.charAt(l)))
                l++;

            while (r > l && !alphaNum(s.charAt(r)))
                r--;

            if (l < s.length() && r >= 0 && s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static boolean alphaNum(char c) {
        return (c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
