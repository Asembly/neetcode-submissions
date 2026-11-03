class MinStack {

    private final Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Deque<Integer> tmp = new ArrayDeque<>();

        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            var value = stack.pop();
            tmp.push(value);
            min = Math.min(min, value);
        }

        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return min;
    }
}
