class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if (m > n) {
            return -1; // Not enough packets to distribute among students
        }

        Collections.sort(a);

        long minDifference = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            long currentDifference = a.get(i + m - 1) - a.get(i);
            minDifference = Math.min(minDifference, currentDifference);
        }

        return minDifference;
    }
}
