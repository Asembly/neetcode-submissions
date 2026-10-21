class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (var str : strs) {
            sb.append(str).append("");
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strings = new ArrayList<>();
        while (i < str.length()) {
            StringBuilder sb = new StringBuilder();
            while (i < str.length() && str.charAt(i) != '') {
                sb.append(str.charAt(i));
                i++;
            }

            strings.add(sb.toString());
            i++;
        }

        return strings;
    }
}
