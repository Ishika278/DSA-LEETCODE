class Solution {

    public static int solve(int i, int j, String text1, String text2, int[][] dp) {

        // Base case
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }

        // Memoization check
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Characters match
        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + solve(i + 1, j + 1, text1, text2, dp);
        }

        // Characters don't match
        return dp[i][j] = Math.max(
                solve(i + 1, j, text1, text2, dp),
                solve(i, j + 1, text1, text2, dp)
        );
    }

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length()][text2.length()];

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return solve(0, 0, text1, text2, dp);
    }
}