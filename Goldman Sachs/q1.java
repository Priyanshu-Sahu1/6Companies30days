
class Solution {
  
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<HashMap<Character,Integer>,ArrayList<String>> mp=new HashMap<>();
        List<List<String>> ans=new ArrayList<List<String>>();
         for(String str:string_list)        
        {
            HashMap<Character,Integer> fmap=new HashMap<>();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            if(mp.containsKey(fmap)==false)
            {
                ArrayList<String> ls=new ArrayList<String>();
                ls.add(str);
                mp.put(fmap,ls);
            }
            else
            {
                ArrayList<String> ls=mp.get(fmap);
                ls.add(str);
            }
        }
        for(ArrayList<String> val:mp.values())
        {
            ans.add(val);
        }
        return ans;
}
}
