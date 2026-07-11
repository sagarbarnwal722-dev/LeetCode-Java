class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder str=new StringBuilder();
       int i=0,j=0;
       int len1=word1.length()-1,len2=word2.length()-1;
       while(i<=len1 && j<=len2)
       {
        if(i==j)
        {
            str.append(word1.charAt(i));
            i++;
        }
        else
        {
            str.append(word2.charAt(j));
            j++;
        }
       }
       while(i<=len1)
       {
        str.append(word1.charAt(i));
        i++;
       } 
       while(j<=len2)
       {
        str.append(word2.charAt(j));
        j++;
       }
       return str.toString();
    }
}