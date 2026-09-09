class Solution {
    public int countGoodNumbers(long n) {

        long eve = (n + 1) / 2;
        long od = n / 2;

        long even = power(5, eve);
        long odd = power(4, od);

        long cal = (even * odd) % 1000000007;

        return (int)cal;
    }

    public long power(long n, long base)
    {
        long result = 1;
        long mod = 1000000007;

        while(base > 0)
        {
            if(base % 2 == 1)
            {
                result = (result * n) % mod;
            }

            n = (n * n) % mod;
            base = base / 2;
        }

        return result;
    }
}