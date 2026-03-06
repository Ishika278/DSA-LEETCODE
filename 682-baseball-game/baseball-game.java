class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] ans = new int[n];
        int i = 0;
        int sum = 0;

        for(String op : operations)
        {
            if(op.equals("C")){
                i--;//remove previous value
            }
            else if(op.equals("D")){
                ans[i] = 2 * ans[i - 1];
                i++;
            }
            else if(op.equals("+")){
                ans[i] = ans[i - 1] + ans[i - 2];
                i++;
            }
            else{
                //convert string into integer value
                ans[i] = Integer.parseInt(op);
                i++;
            }
        }

        for(int j = 0; j < i; j++)
        {
            sum = sum + ans[j];
        }
        return sum;
    }
}