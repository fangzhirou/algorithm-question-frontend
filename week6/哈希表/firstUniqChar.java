class Solution {
    public char firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character c : map.keySet())
        {
            if(map.get(c)==1)
            {
                return c;
            }
            
        }
        return ' ';


    }
}
