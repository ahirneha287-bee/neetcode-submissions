class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, 0, new ArrayList<>());
        return result;
        
    }

    private void backtrack(int[] nums,List<List<Integer>> result,int index, List<Integer> list)
    {
      
        result.add(new ArrayList<>(list));
        

    for(int i= index; i < nums.length; i++)
    {
        list.add(nums[i]);
         backtrack(nums, result, i+1, list);
         list.remove(list.size()-1);
    }
    }
}
