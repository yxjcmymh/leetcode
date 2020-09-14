class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prevMin = 0, prevMax = 0, currMin = 0, currMax = 0, finalMax = 0;
        for (int i = 0; i < nums.length; i++) {
            currMax = Math.max(prevMax * nums[i], Math.max(prevMin * nums[i], nums[i]));
            currMin = Math.min(prevMax * nums[i], Math.min(prevMin * nums[i], nums[i]));
            finalMax = Math.max(finalMax, currMax);
            prevMax = currMax;
            prevMin = currMin;
        }
        return finalMax;
    }
}

// same memory use: 39.4 MB, runtime: 1 ms
