class Solution {
    public int countDigitOne(int n) {
        int sum = 0;

        for(int factor = 1; factor <= n; factor *= 10) {
            
            int higher = n / (factor * 10);
            int current = (n / factor) % 10;
            int lower = n % factor;

            if(current == 0) {
                sum += higher * factor;
            }
            else if(current == 1) {
                sum += higher * factor + lower + 1;
            }
            else {
                sum += (higher + 1) * factor;
            }
        }

        return sum;
    }
}