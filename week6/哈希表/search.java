class Solution {
    public int search(int[] nums, int target) {
        /*HashSet<Integer,Integer> res=new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            res.append(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        if(target==res.getvalues())
        {
            return key;
        }*/
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        int right = i;
        // 若数组中无 target ，则提前返回
        if(j >= 0 && nums[j] != target) return 0;
        // 搜索左边界 right
        i = 0; j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        int left = j;
        return right - left - 1;




    }
}
