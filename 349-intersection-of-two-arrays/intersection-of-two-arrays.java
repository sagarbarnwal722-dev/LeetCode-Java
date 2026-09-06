class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      ArrayList<Integer>nums=new ArrayList<>();
      int left1=0;int left2=0;
      while(left1<nums1.length&&left2<nums2.length)
      {
        if(nums1[left1]==nums2[left2])
        {
            if(nums.isEmpty()||nums.get(nums.size()-1)!=nums1[left1])
            {
            nums.add(nums1[left1]);
            }
            left1++;
            left2++;
        }
        else if(nums1[left1]<nums2[left2])
        {
            left1++;
        }
        else
        {
            left2++;
        }
      }
    int result[]=new int [nums.size()];
    for(int i=0;i<nums.size();i++)
    {
        result[i]=nums.get(i);
    }
    return result;

    }
}