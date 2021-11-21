class Solution {
    public boolean isUnique(String astr) {
        int mark=0;
        for(int i=0;i<astr.length();i++)
        {
            char t=astr.charAt(i);
            int movebit=t-'a';
            int b=1<<movebit;
            if((mark&b)!=0)
            {
                return false;
            }
            mark|=b;
        }
        return true;

    }
}
