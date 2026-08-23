class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        if (num1.equals("1"))
            return num2;

        if (num2.equals("1"))
            return num1;

        int l1 = num1.length();
        int l2 = num2.length();
        

        int[] res = new int[l1 + l2];

        for (int i = 0; i < l1 ; i++)
        {
            int n1 = num1.charAt(i) - '0';
            for (int j = 0; j < l2; j++)
            {
                int n2 = num2.charAt(j) - '0';
                int n12 = n1 * n2;

                res[i + j + 1] += n12;
            }
        }

        for (int i = res.length - 1; i > 0; i--) 
        {
            res[i - 1] += res[i] / 10;
            res[i] = res[i] % 10;
        }

        int start = 0;

        while (res[start] == 0 && start < res.length)
        {
            start++;
        }

        char[] sum = new char[l1 + l2 - start];

        for (int i = start; i < res.length; i++) 
            sum[i - start] = (char) (res[i] + '0');
        
        return new String(sum);
    }
}