class Solution {
    public int maxArea(int[] height) {
       int i=0,j=height.length-1;
       int maxlength=0,area=0;
       while(i<=j)
       {
        area=Math.min(height[i],height[j])*(j-i);
        maxlength=Math.max(area,maxlength);
        if(height[i]<height[j])
        {
            i++;
        }
        else
        {
            j--;
        }
       } 
       return maxlength;

       
    }
}