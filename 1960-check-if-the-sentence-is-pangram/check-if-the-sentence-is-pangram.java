class Solution {
    public boolean checkIfPangram(String sentence) {
       //char arr[] = s.chartoArray(arr);
        //int n = arr.length

        HashSet<Character> set = new HashSet<>();
        
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        
        return set.size() == 26;

    }
}