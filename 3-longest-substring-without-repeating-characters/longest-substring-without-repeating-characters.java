class Solution {

    public int lengthOfLongestSubstring(String s) {

        String str = "";
        int max = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(isthere(c, str) == false)
            {
                str += c;
            }
            else
            {
                // remove characters from beginning
                while(isthere(c, str))
                {
                    str = str.substring(1);
                }

                str += c;
            }

            max = Math.max(max, str.length());
        }

        return max;
    }

    public boolean isthere(char c, String s)
    {
        return s.indexOf(c) != -1;
    }
}