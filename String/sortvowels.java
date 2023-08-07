class Solution {
    public String sortVowels(String s) {
        char temp[]=new char[s.length()];
          Queue<Character> pq = new PriorityQueue<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o'&& s.charAt(i)!='u'&& s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O'&& s.charAt(i)!='U')
            temp[i]=s.charAt(i);
            else
            pq.add(s.charAt(i));

        }

        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]=='\0')
            {
            temp[i]=pq.poll();
            }
        }

        String ans = String.copyValueOf(temp);
        

        return ans;
    }
}