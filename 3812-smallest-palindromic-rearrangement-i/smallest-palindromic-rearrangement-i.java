class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        int index=ch-'a';
        freq[index]=freq[index]+1;
       }
        
       
        char middleChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                middleChar = (char) ('a' + i);
                break;
            }
        }
        
       
        StringBuilder leftHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int count = freq[i] / 2;
            for (int j = 0; j < count; j++) {
                leftHalf.append((char) ('a' + i));
            }
        }
        
        StringBuilder result = new StringBuilder(leftHalf);
        if (middleChar != 0) {
            result.append(middleChar);
        }
        result.append(leftHalf.reverse());
        
        return result.toString();
    }
}