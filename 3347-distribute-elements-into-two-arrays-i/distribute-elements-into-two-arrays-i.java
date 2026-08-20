class Solution {
    public int[] resultArray(int[] nums) {
       ArrayList<Integer>arr1=new ArrayList<>(); 
       ArrayList<Integer>arr2=new ArrayList<>();
       arr1.add(nums[0]);
       arr2.add(nums[1]);
       int i=2;
       while(i<nums.length)
       {
        if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))
        {
            arr1.add(nums[i]);
        }else
        {
            arr2.add(nums[i]);
        }
        i++;
        }
        // while(j<arr1.size())
        // {
        //     nums[j]=arr1.get(j);
        //     j++;
        // }
        // while(j<nums.length && k<arr2.size())
        // {
        //     nums[j]=arr2.get(k);
        //     j++;
        //     k++;
        // }
        int index=0;
        for(int x:arr1)
        {
            nums[index++]=x;
        } 
        for(int x:arr2)
        {
            nums[index++]=x;
        }
        return nums;
    }
}