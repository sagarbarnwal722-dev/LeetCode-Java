class Solution {
    public int smallestIndex(int[] nums) {
      int ans=Integer.MAX_VALUE,i;
      for(i=0;i<nums.length;i++)
      {
        if(i == digitsum(nums[i]))
        {
            ans=Math.min(ans,i);
        }
      }
      if(ans==Integer.MAX_VALUE)
      {
        return -1;
      }
      return ans;
    }
    public int digitsum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}