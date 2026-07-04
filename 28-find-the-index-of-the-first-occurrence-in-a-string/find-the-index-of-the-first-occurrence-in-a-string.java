class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        index=haystack.indexOf(needle);
        if(index != -1)
        {
            return index;
        }
        return -1;

    }
}