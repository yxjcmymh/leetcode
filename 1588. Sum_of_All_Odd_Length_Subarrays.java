class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += ((i + 1) * (len - i) + 1) / 2 * arr[i];
        }
        /** Explaination:
         *   (i + 1) - # of indexes on the left (including i)
         *   (len - i) - # of indexes on the right (including i)
         *   (i + 1) * (len - i) - total possible # of subarrays that contains arr[i
         *   ((i + 1) * (len - i) + 1) / 2 - ceil division to get the # of odd length subarrays
         *   sum += count * value
         */

        return sum;
    }
} // memory use: 37.3 MB (100%), runtime: 0 ms (100%)
