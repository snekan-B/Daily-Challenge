class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> val=new ArrayList<>();
        csum(ans,val,candidates,target,0,0);
        return ans;
    }

    public static void csum(List<List<Integer>> ans,List<Integer> arr,int[] candidates,int target,int sum,int index)
    {
        if(index==candidates.length)
        {
            if(sum==target)
            {
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        
        if(sum<target)
        {
        arr.add(candidates[index]);
        sum+=candidates[index];
        csum(ans,arr,candidates,target,sum,index);
        sum-=candidates[index];
        arr.remove(arr.size()-1);
        }
        csum(ans,arr,candidates,target,sum,index+1);
}}