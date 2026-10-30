class Solution {
    public static boolean isValidSudoku(char[][] board) {
 Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.')
                    continue;

                String squareKey = (i / 3) + "," + (j / 3);

                if (cols.computeIfAbsent(i, (k) -> new HashSet<>()).contains(board[i][j]) ||
                        rows.computeIfAbsent(j, (k) -> new HashSet<>()).contains(board[i][j]) ||
                        squares.computeIfAbsent(squareKey, (k) -> new HashSet<>()).contains(board[i][j])) {
                    return false;
                }

                cols.get(i).add(board[i][j]);
                rows.get(j).add(board[i][j]);
                squares.get(squareKey).add(board[i][j]);
            }
        }

        return true;

    }
}
