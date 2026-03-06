class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0, down = 0, right = 0, left = 0;

        for (char move : moves.toCharArray())
        {
         //to move up
          if(move == 'U') up++;
         //to move down 
          if(move == 'D') down++;
         //to move right
          if(move == 'R') right++;
         //to move left
          if(move == 'L') left++;
        }
        //back to origin 
        if((up == down) && (right == left)) return true;
        //else 
        return false;
    }
}