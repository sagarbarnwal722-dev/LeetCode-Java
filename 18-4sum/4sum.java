class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> List = new ArrayList<>();
        Arrays.sort(nums);

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length; j++) {

                // CHANGED: j > 0 → j > i + 1
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = nums.length - 1;

                // CHANGED: added { }
                while (left < right) {
                    sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];

                    if (sum == target) {
                        ArrayList<Integer> Quad = new ArrayList<>();

                        Quad.add(nums[i]);
                        Quad.add(nums[j]);
                        Quad.add(nums[left]);
                        Quad.add(nums[right]);

                        List.add(Quad);

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        return List;
    }
}