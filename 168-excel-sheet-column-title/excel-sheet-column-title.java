class Solution {
    public String convertToTitle(int columnNumber) {
       String str="";
       while(columnNumber>0)
       {
        columnNumber--;
        int rem=columnNumber%26;
        str=(char)('A'+rem)+str;
        columnNumber/=26;
       }
       return str; 
    }
}