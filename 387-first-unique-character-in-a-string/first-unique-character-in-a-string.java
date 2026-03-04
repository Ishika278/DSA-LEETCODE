class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int [26];
        int n = s.length();
   
        //to count freq of each character
        for(int i = 0; i < n; i++)
        {
            count[s.charAt(i) - 'a']++;
        }
        // to find first character with freq 1
        for(int i = 0; i < n ; i++)
        {
            if(count[s.charAt(i) - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}