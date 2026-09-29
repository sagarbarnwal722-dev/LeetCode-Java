class Solution {
public String longestPalindrome(String s) {
String str="";
for(int i=0;i<s.length();i++)
{
    String odd=expand(s,i,i);
    String even=expand(s,i,i+1);
    if(odd.length()>str.length())
    {
        str=odd;
    }
    if(even.length()>str.length())
    {
        str=even;
    }
}
return str;
}
public String expand(String s,int i,int j)
{
    while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
    {
        i--;
        j++;
    }
    return s.substring(i+1,j);
}
}