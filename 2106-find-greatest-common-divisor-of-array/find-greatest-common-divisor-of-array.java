class Solution {
    public int findGCD(int[] nums) {
        int sm=nums[0],lr=nums[0],n=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<sm)
            {
                sm=nums[i];
            }
            if(nums[i]>lr)
            {
                lr=nums[i];
            } 
        }
        for(int i=sm;i>=1;i--)
        {
            if(sm%i==0 && lr%i==0)
            {
                return i;
            }
            
        }
        return 1;
}
}