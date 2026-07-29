class Solution
{


public int findDuplicate(int[] nums) {
        boolean[] count = new boolean[nums.length];
        for (int num : nums) {
            if (count[num]) return num;
            count[num] = true;
        }
        return 0;
    }
}