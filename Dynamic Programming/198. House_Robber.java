class Solution { // first attempt
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) dp[i] = nums[i];
            else if(i == 1) dp[i] = Math.max(nums[i-1], nums[i]);
            else dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }

        return dp[nums.length-1];
    }
} // from this we know we actually only need two numbers instead of an array

class Solution {
    public int rob(int[] nums) {
        int curr = 0, prev = 0;
        for (int n : nums) {
            int temp = curr;
            curr = Math.max(prev + n, curr);
            prev = temp;
        }
        return curr;
    }
} // memory use: 36.3 MB (99.76%), runtime: 0 ms (100%)
