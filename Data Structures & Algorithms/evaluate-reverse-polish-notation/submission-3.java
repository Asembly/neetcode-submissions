class Solution {
     public static int dfs(List<String> tokens) {
        String token = tokens.remove(tokens.size() - 1);

        if (!"+-*/".contains(token))
            return Integer.parseInt(token);

        int right = dfs(tokens);
        int left = dfs(tokens);

        switch (token) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
        }

        return 0;
    }

    public static int evalRPN(String[] tokens) {
        List<String> tokensList = new ArrayList<>(Arrays.asList(tokens));
        return dfs(tokensList);
    }
}
