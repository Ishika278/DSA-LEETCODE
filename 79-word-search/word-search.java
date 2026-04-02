class Solution {
    public static boolean Solve(int k, int i, int j, String target, char[][] word)
    {
        int n = word.length;
        int m = word[0].length;
        if(k == target.length())
        {
            return true;
        }
    
        if( i < 0 || j < 0  || i >= n || j >= m ||  target.charAt(k) != word[i][j]) return false;

        char temp = word[i][j];
        word[i][j] = '*';

        boolean top    = Solve(k + 1, i    , j - 1, target, word);
        boolean bottom = Solve(k + 1, i    , j + 1, target, word);
        boolean left   = Solve(k + 1, i - 1, j    , target, word);
        boolean right  = Solve(k + 1, i + 1, j    , target, word);

        word[i][j] = temp;
        return top || bottom || left || right;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if (Solve(0, i, j, word, board)) return true;
            }
        }
        return false;
    }
}