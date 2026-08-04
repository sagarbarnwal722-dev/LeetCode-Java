class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int min=nums[0],max=nums[0],i=1;
        while(i!=nums.length)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            i++;
        }
        for(int j=min;j<=max;j++)
        {
            boolean found=false;
            for(int k=0;k<nums.length;k++)
            {
                if(j==nums[k])
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                ans.add(j);
            }

        }
        return ans;
    }
}