class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestSeq= 0;
        for(int num: nums)
        {
            set.add(num);
        }

        
        for(int num: nums)
        {
             int start = 0;
           if(!set.contains(num-1))
            {
                int curr = num;
              while(set.contains(curr))
              {
                start++;
                curr++;
                longestSeq= Math.max(start, longestSeq);

              }
               
            }
        }
        return longestSeq;
        
    }
}
