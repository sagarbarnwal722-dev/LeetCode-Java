class Solution {
    public int maximumGap(int[] nums) {
    Arrays.sort(nums);   
    int temp=0;
      for(int i=nums.length-1;i>0;i--)
      {
        temp=Math.max(temp,nums[i]-nums[i-1]);

      }
      return temp;
    }
}