class Solution {

    public long countCommas(long n) {

        if(n < 999)
        {
            return 0;
        }

        long count = 0;

        if(n < 999999)
        {
            return n - 999;
        }
        else if(n < 999999999)
        {
            count += 999000;
            count += (n - 1000000 + 1) * 2;
        }
        else if(n < 999999999999L)
        {
            count += 999000;
            count += (999999999 - 1000000L + 1) * 2;
            count += (n - 1000000000L + 1) * 3;
        }
        else if(n < 999999999999999L)
        {
            count += 999000;
            count += (999999999 - 1000000L + 1) * 2;
            count += (999999999999L - 1000000000L + 1) * 3;
            count += (n - 1000000000000L + 1) * 4;
        }
        else
        {
            count += 999000;
            count += (999999999 - 1000000L + 1) * 2;
            count += (999999999999L - 1000000000L + 1) * 3;
            count += (999999999999999L - 1000000000000L + 1) * 4;
            count += (n - 1000000000000000L + 1) * 5;
        }

        return count;
    }
}