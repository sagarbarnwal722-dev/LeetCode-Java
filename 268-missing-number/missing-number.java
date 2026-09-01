class Solution {
    public int missingNumber(int[] nums) {
        // int xor = nums.length;

        // for (int i = 0; i < nums.length; i++) {
        //     xor = xor ^ i ^ nums[i];
        // }

        // return xor;
        int len=nums.length,act=0;
        int expect=(len*(len+1))/2;
        for(int i:nums)
        {
            act+=i;
        }
        return expect-act;
    }
}