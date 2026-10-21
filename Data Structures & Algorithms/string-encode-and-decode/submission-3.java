class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (var str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strings = new ArrayList<>();
        while (i < str.length()) {
            StringBuilder sb = new StringBuilder();

            String len = new String();
            while (i < str.length() && str.charAt(i) != '#')
                len += str.charAt(i++);

            System.out.println(len);

            int k = 0;
            while (++i < str.length() && k < Integer.parseInt(len)) {
                sb.append(str.charAt(i));
                k++;
            }
            strings.add(sb.toString());
        }

        return strings;
    }
}
