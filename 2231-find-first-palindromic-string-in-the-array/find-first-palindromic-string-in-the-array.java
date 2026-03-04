class Solution {
    public String firstPalindrome(String[] words) {
      
        for(String word : words)
        {
            if(ispalindrome(word))
            {
            return word;
            }
        }
        return "";
    }


    public boolean ispalindrome(String s){
        int n = s.length();
        int left = 0;
        int right = n -1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}