class Solution { // first try
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        while(i < len) {
            while(nums[i] == val) {
                len--;
                if(i == len) break;
                int temp = nums[i];
                nums[i] = nums[len];
                nums[len] = temp;
            }
            i++;
        }
        return len;
    }
}

// same memory use: 34.4 MB, runtime: 0 ms

class Solution { // simpler way --- just replace the correct element at the corrent index
    public int removeElement(int[] nums, int val) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[ret++] = nums[i];
        }
        return ret;
    }
};
