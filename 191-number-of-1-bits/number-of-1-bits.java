class Solution {
    public int hammingWeight(int n) {
        String s=" ";
        while(n!=0)
        {
            int rem=n%2;
            s=s+rem;
            n=n/2;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}