class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
       int n = hours.length;
       int i = 0, employee = 0;
       
        while(i < n)
        {
           if(hours[i] >= target)
          {
            employee++;
          }
          i++;
        }
        return employee;
    }
}