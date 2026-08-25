class Solution {
    public int missingMultiple(int[] nums, int k) {
       int mul=1,j,i;
       if(nums.length==1)
       {

       }
       for(i=1;i<=nums.length+1;i++)
       {
        mul=i*k;
        boolean found=false;
        for(j=0;j<nums.length;j++)
        {
            if(mul==nums[j])
            {
                found=true;
                break;
            }
        }
        if(!found)
        {
            return mul;
        }
    }
    return -1;
}
}