class Solution {
    public String reverseWords(String s) {
        s.trim();
        int j=s.length()-1;
        int i=j;
        StringBuilder res=new StringBuilder();
        while(i>=0)
        {
            while(i >= 0 &&s.charAt(i)!=' ')
            {
                //res.append(s.charAt(i));
                i--;
            }
            res.append(s.substring(i+1,j+1));
            res.append(' ');
            while(i >= 0 &&s.charAt(i)==' ')
            {
                //res.append(s.substring(i+1,j+1));
                i--;
                //j=i;

            }
            j=i;

        }
        return  res.toString().trim();

    }
}
