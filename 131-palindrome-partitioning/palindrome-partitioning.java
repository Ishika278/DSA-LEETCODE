import java.util.*;

class Solution {

    public boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void solve(int i, String s, List<List<String>> result, List<String> curr) {
        if (i == s.length()) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(i, j, s)) {
                curr.add(s.substring(i, j + 1));
                solve(j + 1, s, result, curr);
                curr.remove(curr.size() - 1); // backtrack
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        solve(0, s, result, curr);
        return result;
    }
}