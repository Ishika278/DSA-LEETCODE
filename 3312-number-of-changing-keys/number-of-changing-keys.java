class Solution {
    public int countKeyChanges(String s) {
        
        String n = s.toLowerCase();
        int count = 0;

         for(int i = 1; i < s.length(); i++)
         {
            if(n.charAt(i) != n.charAt(i - 1))
            {
                count++;
            }
         }
         return count;
    }
}