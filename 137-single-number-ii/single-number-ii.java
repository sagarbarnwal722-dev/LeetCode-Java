class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i++) {
    int num = nums[i];

    ones = (ones ^ num) & ~twos;
    twos = (twos ^ num) & ~ones;
}

        return ones;
    }
}