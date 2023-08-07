class Solution {
    public List<List<Integer>> generate(int n) {
        int dp[]=new int[2];
        dp[0]=1;
        dp[1]=1;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        temp.add(1);

        if(n>=1)
        {
            arr.add(dp[0]);
            ans.add(new ArrayList<>(arr));
            arr.clear();
        }
        if(n>=2)
        {
            arr.add(dp[0]);
            arr.add(dp[1]);
            ans.add(new ArrayList<>(arr));
           arr.clear();
        }
        int c=3;
        while(n>=c)
        {
            arr.add(1);
            int i=0;
            int j=1;
            while(j<temp.size())
            {
                int sum=temp.get(i)+temp.get(j);
                i++;
                j++;
                arr.add(sum);
            }
            arr.add(1);
            temp.clear();
            for(int k:arr)
            temp.add(k);
            ans.add(new ArrayList<>(arr));
            arr.clear();
            c++;

        }
        return ans;


    }
}