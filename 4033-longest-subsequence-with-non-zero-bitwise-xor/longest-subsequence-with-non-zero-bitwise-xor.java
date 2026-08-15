class Solution {
    public int longestSubsequence(int[] nums) {
        int cal=0,i=0,count=0;
        while(i!=nums.length)
        {
            if(nums[i]==0)
                count++;
            i++;
        }
        if(count==nums.length)
        {
            return 0;
        }
        
        for(i=0;i<nums.length;i++)
        {
            cal=cal^nums[i];
        }
        if(cal!=0)
        {
            return nums.length;
        }
        return nums.length-1;

    }
}