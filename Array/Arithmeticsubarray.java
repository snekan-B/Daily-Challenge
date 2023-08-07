class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int flag=0;
        for(int i=0;i<l.length;i++)
        {
            int start=l[i];
            int temp=start;
            int end=r[i];
            while(start<=end)
            {
                arr.add(nums[start]);
                start++;
            }
            Collections.sort(arr);
            System.out.println(arr);
            int sub=Math.abs(arr.get(0)-arr.get(1));
            for(int j=2;j<arr.size();j++)
            {
                if(sub!=(Math.abs(arr.get(j-1)-arr.get(j))))
                {
                ans.add(false);
                flag=1;
                break;
                }
            }
            if(flag==0)
            ans.add(true);

            flag=0;
            arr.clear();
        }

        return ans;
    }
}