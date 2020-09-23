class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n1 = 0, n2 = 0, c1 = 0, c2 = 0;
        int minAppear = nums.length / 3;

        for(int n : nums) { // find the two most occurance
            if(n == n1) c1++;
            else if(n == n2) c2++;
            else if(c1 == 0) {
                n1 = n;
                c1 = 1;
            }
            else if(c2 == 0) {
                n2 = n;
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;

        for(int n : nums) {
            if(n == n1) c1++;
            else if(n == n2) c2++;
        }

        if(c1 > minAppear) ans.add(n1);
        if(c2 > minAppear) ans.add(n2);

        return ans;
    }
} // memory use: 43.3 MB (69.01%), runtime: 1 ms (100%)
