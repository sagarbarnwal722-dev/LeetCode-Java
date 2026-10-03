class Solution {
    public boolean canTransform(int[] source, int[] target) {
      return   sum_arr(source)==sum_arr(target);
    }
    public long sum_arr(int arr[])
    {
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];            
        }
        return sum;
    }
}