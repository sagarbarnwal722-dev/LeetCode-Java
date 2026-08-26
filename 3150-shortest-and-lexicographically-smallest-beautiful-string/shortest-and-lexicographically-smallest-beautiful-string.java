class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       ArrayList<Integer>ones=new ArrayList<>();
       int count=0;
       String ans="";
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='1')
        {
            ones.add(i);
        }
       }
       if(ones.size()<k)
       {
        return "";
       }
       int limit=ones.size()-k;
       for(int i=0;i<=limit;i++)
       {
        int start=ones.get(i);
        int end=ones.get(i+k-1);
        String current=s.substring(start,end+1);
        if(ans.equals("")||current.length()<ans.length()||(current.length()==ans.length()&&current.compareTo(ans)<0))
       {
        ans=current;
       }
       }
       
       return ans;
       
     
    }
}