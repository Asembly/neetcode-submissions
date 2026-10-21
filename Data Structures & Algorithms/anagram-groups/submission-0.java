class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String, List<String>> anagrams = new HashMap<>();

        for (var s : strs) {
            var chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            var list = anagrams.getOrDefault(sorted, new ArrayList<>());
            list.add(s);
            anagrams.put(sorted, list);
        }

        List<List<String>> ans = new ArrayList<>();
        for (var a : anagrams.entrySet())
            ans.add(a.getValue());

        return ans;
    }
}
