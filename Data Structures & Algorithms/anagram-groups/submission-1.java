class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (var s : strs) {
            int[] dict = new int[26];
            for (var chr : s.toCharArray()) {
                dict[chr - 'a']++;
            }

            String key = Arrays.toString(dict);
            var list = anagrams.getOrDefault(key, new ArrayList<>());
            list.add(s);
            anagrams.put(key, list);
        }

        List<List<String>> ans = new ArrayList<>();
        for (var a : anagrams.entrySet())
            ans.add(a.getValue());

        return ans;
    }
}
