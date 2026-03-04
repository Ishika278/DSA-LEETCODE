class Solution {
    public int mostWordsFound(String[] sentences) {
       
        int maxwords = 0;

        for(String sentence : sentences)
        {   
            int count = 1;
            for(int i =0; i < sentence.length(); i++)
            {
                if(sentence.charAt(i) == ' ')
                {
                    count++;
                }
            }
            maxwords = Math.max(maxwords, count);
        }
        return maxwords;
    }
}