class Solution {
    public int removeDuplicates(int[] nums) {
        int ret = 0;
        boolean twice = false;
        if(nums.length < 0) return 0;
        if(nums.length <= 2) return nums.length;

        for (int i = 1; i < nums.length; i++) {
            if((nums[i] == nums[ret]) && (!twice)) {
                nums[++ret] = nums[i];
                twice = true;
            }
            else if (nums[i] != nums[ret]) {
                nums[++ret] = nums[i];
                twice = false;
            }
        }
        return ret + 1; // last index + 1 = length
    }
}

// memory use: 36.7 MB, runtime: 1 ms
