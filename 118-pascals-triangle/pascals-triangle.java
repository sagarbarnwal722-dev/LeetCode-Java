class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
        {
            List<Integer> row = ncr(i);
            pascal.add(row);
        }

        return pascal;
    }

    public List<Integer> ncr(int r)
    {
        List<Integer> ans = new ArrayList<>();

        long res = 1;

        ans.add(1);

        for(int i = 1; i <= r; i++)
        {
            res = res * (r - i + 1);
            res = res / i;

            ans.add((int)res);
        }

        return ans;
    }
}