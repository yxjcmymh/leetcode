class Solution {
    public int removeDuplicates(int[] nums) {
        int ret = 0;
        boolean twice = false;
        if(nums.length < 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == nums[ret]) && (!twice)) {
                nums[++ret] = nums[i];
                twice = true;
            }
            if (nums[i] != nums[ret]) {
                nums[++ret] = nums[i];
                twice = false;
            }
        }
        return ret + 1; // last index + 1 = length
    }
}

// memory use: 38.5 MB, runtime: 1 ms
