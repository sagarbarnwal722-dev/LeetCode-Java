class Solution {
    public List<List<Integer>> permute(int[] nums) {
       ArrayList<List<Integer>>result=new ArrayList<>();
       ArrayList<Integer> ans=new ArrayList<>();
       boolean used[]=new boolean[nums.length];
       backtracking(nums,ans,used,result);
       return result;  

    }
    public void backtracking(int nums[],ArrayList<Integer>ans,boolean used[],ArrayList<List<Integer>>result)
    {
       
      int i;
      if(ans.size()==nums.length)
      {
        result.add(new ArrayList<>(ans));
      return;
      }
      for(i=0;i<nums.length;i++)
      {
        if(used[i])
        {
            continue;
        }
        ans.add(nums[i]);
        used[i]=true;
        backtracking(nums,ans,used,result);
        ans.remove(ans.size()-1);
        used[i]=false;
      }
        
    }
}