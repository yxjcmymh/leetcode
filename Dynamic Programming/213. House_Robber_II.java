class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        return Math.max(rob(nums, 0, nums.length-1), rob(nums, 1, nums.length));
    }

    private int rob(int[] nums, int l, int r) {
        int curr = 0, prev = 0;
        for (; l < r; l++) {
            int temp = curr;
            curr = Math.max(prev + nums[l], curr);
            prev = temp;
        }
        return curr;
    }
} // memory use: 37 MB (49%), runtime: 0 ms (100%)
