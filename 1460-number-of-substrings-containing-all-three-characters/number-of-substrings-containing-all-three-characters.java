class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0, j = 0;
        int count = 0;
        //int ans = 0;
        int[] ans = new int[26];
        if(n < 3) return 0;
        while(j < n )
        {
            //putting element
            ans[s.charAt(j)-'a']++;
            while(ans[0] > 0 && ans[1] > 0 && ans[2] > 0)
            {
                //element remove
                count += n - j;
                ans[s.charAt(i)-'a']--;
                i++;
                
            }
            j++;
        }
        return count;
    }
}