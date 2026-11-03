class Solution {
    public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (brackets.containsKey(s.charAt(i))) {
                if (!stack.isEmpty() && stack.peek() == brackets.get(s.charAt(i))) {
                    stack.poll();
                } else
                    return false;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
 
    }
}
