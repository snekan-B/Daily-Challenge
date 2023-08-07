class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character,Integer> map=new HashMap<>();
        int curr=0;
        int val=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<chars.length();i++)
        {
            map.put(chars.charAt(i),vals[i]);
        }

        for(int i=0;i<s.length();i++)
        {
           if(map.containsKey(s.charAt(i)))
           val=map.get(s.charAt(i));
           else
           val=s.charAt(i)-'a'+1;

           curr+=val;
           

           if(curr<=0)
           curr=0;
           else if(curr>max)
           max=curr;
           
        }

        return (max<0)?0:max;


    }
}