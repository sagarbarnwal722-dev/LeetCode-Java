class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sub=0;
        for(int i=0;i<nums.length;i++)
        {
                max=Math.max(max,nums[i]);
            int min=Integer.MAX_VALUE;
            for(int p=i;p<nums.length;p++)
            {
                min=Math.min(min,nums[p]);
            }
            sub=max-min;
            if(sub<=k)
            {
                return i;
            }
        }
        return -1;
    }
}