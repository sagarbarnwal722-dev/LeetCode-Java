class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(ispallindrome(s,i,j))
                {
                    if((j-i+1)>str.length())
                    {
                    str=s.substring(i,j+1);
                    }
                }
            }
        }
        return str;
    }
    public boolean ispallindrome(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}