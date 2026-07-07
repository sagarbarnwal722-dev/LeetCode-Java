class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
       String numstr=Integer.toString(n);
       StringBuilder str=new StringBuilder();
       for(int i=0;i<numstr.length();i++)
       {
        if(numstr.charAt(i) != '0')
        {
            str.append(numstr.charAt(i));
        }
       }
       if (str.length() == 0) {
    return 0;
}
       int nu=Integer.parseInt(str.toString());
       int p=nu;
       while(nu != 0)
       {
        int rem=nu %10;
        sum=sum+rem;
        nu=nu/10;
       }
        return (long)sum*p;
       }
}
       