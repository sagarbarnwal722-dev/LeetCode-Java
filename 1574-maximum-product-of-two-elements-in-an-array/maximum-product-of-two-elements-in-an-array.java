class Solution {
    public int maxProduct(int[] nums) {
        int curr=0,max1=0,max2=0;
        for(int i=0;i<nums.length;i++)
        { curr=nums[i];
            if(curr > max1)
            {
                max2=max1;
                max1=curr;
            }else if(curr > max2)
            {
                max2=curr;
            }

        }
        return (max1-1)*(max2-1);
    }
}