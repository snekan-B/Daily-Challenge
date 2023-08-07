class Solution {
    public List<String> letterCombinations(String digits) {

         
        List<String> ans=new ArrayList<>();
        if(digits.length()==0)
        return ans;

        Map<Character,String> map=new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        StringBuilder sb=new StringBuilder();

        comb(sb,map,ans,digits,0);

        return ans;


    }

    public static void comb(StringBuilder sb,Map<Character,String> map,List<String> ans,String digits,int index)
    {
        if(index==digits.length())
        {
            ans.add(sb.toString());
            return;
        }

        String str=map.get(digits.charAt(index));
        for(int i=0;i<str.length();i++)
        {
            sb.append(str.charAt(i));
            comb(sb,map,ans,digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}