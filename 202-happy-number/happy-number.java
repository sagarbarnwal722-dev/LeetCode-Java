class Solution {
    public boolean isHappy(int n) {
        if(n==1)
        {
            return true;
        }
        if(n==4)
        {
            return false;
        }
        int temp=n,r=0,m=0;
        while(temp!=0)
        {
            r=temp%10;
            m+=r*r;
            temp=temp/10;
        }
        return isHappy(m);
    }
}