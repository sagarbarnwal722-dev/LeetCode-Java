class Solution {
    public int myAtoi(String s) {
        if(s==null || s.isEmpty())
        {
            return 0;
        }
        int sign=1,i=0,base=0,n=s.length();
        int INT_MAX=Integer.MAX_VALUE, INT_MIN=Integer.MIN_VALUE;
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        if(i==n)
        {
            return 0;
        }
        if(s.charAt(i)=='-' || s.charAt(i)=='+')
        {
            sign=(s.charAt(i)=='-')?-1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int digit=s.charAt(i)-'0';
        
        if(base > INT_MAX /10 ||(base == INT_MAX/10 && digit >7))
        {
            return (sign ==1)?INT_MAX:INT_MIN;
        }
        base=base *10+digit;
        i++;
        }
    return base * sign;
    }
}