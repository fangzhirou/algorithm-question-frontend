class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        i=0;
        j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]>target)
            {
                j--;
            }
            if(nums[i]+nums[j]<target)
            {
                i++;
            }
            if(nums[i]+nums[j]==target){
                return new int[] { nums[i], nums[j] };
            }
        }
        return new int [0];

    }
}
