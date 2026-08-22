class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n,mul=1,sum=0,r=0;
        while(temp!=0)
        {
            r=temp%10;
            mul*=r;
            sum+=r;
            temp=temp/10;
        }
        if(n%(sum+mul)==0)
        {
            return true;
        }
        return false;
    }
}