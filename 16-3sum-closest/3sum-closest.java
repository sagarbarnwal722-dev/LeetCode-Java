class Solution {
    public int threeSumClosest(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                   int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int left,col,sum=0;
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            left=i+1 ;col=nums.length-1;
            while(left<col)
            {

            
            sum=nums[i]+nums[left]+nums[col];
            if(sum==target)
            {
                return sum;
            }
            if(sum<target)
            {
                left++;
            }
            else if(sum >target)
            {
                col--;;
            }
            if(Math.abs(sum-target)<Math.abs(closest-target))
            {
                closest=sum;
            }
            
            }


        }
        return closest;
        
    }
}