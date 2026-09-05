class Solution {
    public int firstStableIndex(int[] nums, int k) {
    
        int sub=0;
        int prefixMax[]=new int[nums.length];
        int suffixMax[]=new int[nums.length];
        prefixMax[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
                prefixMax[i]=Math.max(nums[i],prefixMax[i-1]);
        }
        suffixMax[nums.length-1]=nums[nums.length-1];
            for(int p=nums.length-2;p>=0;p--)
            {
                suffixMax[p]=Math.min(nums[p],suffixMax[p+1]);
            }
        for(int j=0;j<nums.length;j++)
        {
        sub=prefixMax[j]-suffixMax[j];
            if(sub<=k)
            {
                return j;
            }
        }
        return -1;
    }
}