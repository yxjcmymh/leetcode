class Solution {
    List<List<Integer>> sol;

    public List<List<Integer>> combinationSum3(int k, int n) {
        sol = new ArrayList<>();

        helper(k, n, new LinkedList(), 1);

        return sol;
    }

    private void helper(int k, int n, LinkedList<Integer> list, int index) {
        if(k == list.size() && n == 0) {
            sol.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i <= 9; i++) {
            list.add(i);
            helper(k, n-i, list, i+1);
            list.removeLast();
        }
    }
}

// same memory use: 36.7 MB, runtime: 0 ms
