// Time: iterating O(N) + sorting O(Nlog(N)) = O(Nlog(N)), Space: O(N)
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> m = new TreeMap<>();
        for (int[] t : trips) {
            m.put(t[1], m.getOrDefault(t[1], 0) + t[0]);
            m.put(t[2], m.getOrDefault(t[2], 0) - t[0]);
        }

        int pass = 0;
        for (int p : m.values()) {
            pass += p;

            if(pass > capacity) return false;
        }

        return true;
    }
} // memory use: 38.9 MB (73.03%), runtime: 4 ms (93.92%)

// Time: O(max(N,1001)), Space: O(1001) = O(1)
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] timestamp = new int[1001];
        for (int[] trip : trips) {
            timestamp[trip[1]] += trip[0];
            timestamp[trip[2]] -= trip[0];
        }
        int ued_capacity = 0;
        for (int number : timestamp) {
            ued_capacity += number;
            if (ued_capacity > capacity) {
                return false;
            }
        }
        return true;
    }
}
