class Solution {
     List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        calculateTarget(nums, target, target,0, new ArrayList<>());
        return result;
        
    }

    private void  calculateTarget(int[] nums, int target, int left, int start, List<Integer> curList)
    {
        if(left == 0)
        {
            result.add(new ArrayList(curList));
            return;
        }

        for(int i = start; i < nums.length; i++)
        {
            if(i > start && nums[i] == nums[i-1])
                continue;
            if(nums[i] > left)
            {
               break;
            }
        curList.add(nums[i]);
        calculateTarget(nums, target, left - nums[i],i+1,curList );
        curList.remove(curList.size() - 1);
        }
    }
}

