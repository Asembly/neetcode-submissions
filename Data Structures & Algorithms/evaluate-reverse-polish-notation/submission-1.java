class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (var t : tokens) {
            if ("+".equals(t)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if ("-".equals(t)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);

            } else if ("*".equals(t)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);

            } else if ("/".equals(t)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
