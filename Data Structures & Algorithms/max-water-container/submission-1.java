class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;

        int max = 0;

        while(left < right)
        {
            int ht = Math.min(heights[left], heights[right]);
            max = Math.max(max, (right-left)* ht);

            if(heights[left] < heights[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return max;
        
    }
}
