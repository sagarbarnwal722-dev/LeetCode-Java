class Solution {
    public boolean checkPerfectNumber(int num) {
      int sum=0,temp;
      temp=num;
      for(int i=1;i<temp;i++)
      {
        if(temp%i==0)
        {
            sum+=i;
        }
    }
    if(sum==num)
    {
        return true;
    }
    return false;  
    }
}