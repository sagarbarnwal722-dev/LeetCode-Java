class Solution {
    public int reverseDegree(String s) {
     int sum=0;
     for(int i=0;i<s.length();i++)
     {
        int reversed=26-(s.charAt(i)-'a');
        int k=i+1;
        int mul=k*reversed;
        sum+=mul;
        }
        return sum;   
    }
}