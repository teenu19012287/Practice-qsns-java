class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
        int j=1;
        int max = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i] !=nums[i-1])
                 j++;
            if(j==3)
                  max = nums[i-1];
        }
        return max;
    }
}
