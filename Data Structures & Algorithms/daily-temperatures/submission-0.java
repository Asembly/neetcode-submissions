class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Deque<int[]> stack = new ArrayDeque<>();

        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            var temp = temperatures[i];

            while (!stack.isEmpty() && temp > stack.peek()[0]) {
                var pair = stack.pop();
                ans[pair[1]] = i - pair[1];
            }

            stack.push(new int[] { temp, i });
        }

        return ans;
 
    }
}
