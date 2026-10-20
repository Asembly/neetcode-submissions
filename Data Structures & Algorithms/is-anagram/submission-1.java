class Solution {
    public boolean isAnagram(String s, String t) {
        int[] dictS = new int[26];
        int[] dictT = new int[26];

        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++) {
            dictS[s.charAt(i) - 'a']++; 
            dictT[t.charAt(i) - 'a']++; 
        }

        for(int i = 0; i < 26; i++)
        {
            if(dictS[i] != dictT[i])
                return false;
        }

        return true;
    }
}
