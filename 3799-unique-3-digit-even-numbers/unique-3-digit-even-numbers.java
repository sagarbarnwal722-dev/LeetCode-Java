class Solution {
    public int totalNumbers(int[] digits) {
        int ans = 0;

        for (int num = 100; num <= 998; num++) {

            if (num % 2 != 0)
                continue;

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] freq = new int[10];

            for (int d : digits)
                freq[d]++;

            if (freq[a] > 0) {
                freq[a]--;

                if (freq[b] > 0) {
                    freq[b]--;

                    if (freq[c] > 0)
                        ans++;
                }
            }
        }

        return ans;
    }
}