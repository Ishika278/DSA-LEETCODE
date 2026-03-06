class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int n = words.length;

        for(int i = 0; i < n; i++)
        {
            //checks if char x exist in word
            if(words[i].indexOf(x) != -1)
            {
                ans.add(i);//push to arraylist
            }
        }
        return ans;
    }
}