class Solution {
    public String toHex(int num) {

        if(num == 0)
            return "0";

        StringBuilder str = new StringBuilder();

        String val[] = {
            "0","1","2","3","4","5","6","7",
            "8","9","a","b","c","d","e","f"
        };

        while(num != 0) {
            int rem = num & 15;
            str.append(val[rem]);

            num = num >>> 4;
        }

        return str.reverse().toString();
    }
}