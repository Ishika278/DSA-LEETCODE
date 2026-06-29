class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j)
        {
             // Skip non-alphanumeric characters
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) 
            {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }

                // Compare after converting to lowercase
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                {
                    return false;
                }
            i++;
            j--;
        }
        return true;
    }
}