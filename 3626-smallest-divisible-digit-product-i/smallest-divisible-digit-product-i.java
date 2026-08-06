class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(i>=n)
        {
            int d=0,mul=1,temp=i;
            while(temp!=0)
            {
            d=temp % 10;
            mul=mul*d;
            temp=temp/10;
        }
        if(mul%t==0)
        {
            return i;
        }
        i+=1;
        }
        return 0;
    }
}