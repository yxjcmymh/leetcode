class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList();

        if(newInterval != null && newInterval.length != 0) {
            for(int[] inner : intervals) {
                if(newInterval[1] < inner[0]) {
                    list.add(newInterval);
                    newInterval = inner;
                } else if(newInterval[0] > inner[1]) {
                    list.add(inner);
                } else {
                    newInterval[0] = Math.min(newInterval[0], inner[0]);
                    newInterval[1] = Math.max(newInterval[1], inner[1]);
                }
            }
        }
        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}

// same memory use: 44.7 MB, runtime: 1 ms
