class Solution {
    public int findMin(int[] nums) {
        int i=nums[0];
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]<i)
            {
                i=nums[j];
            }
        }
        return i;
    }
}