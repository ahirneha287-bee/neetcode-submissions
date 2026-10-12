class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int prevTwo = nums[0];
        int prevOne= Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++)
        {
            int current = Math.max(prevOne, nums[i]+prevTwo);
            prevTwo=prevOne;

            prevOne= current;
        }
        return prevOne;
        
        
        
    }
}
