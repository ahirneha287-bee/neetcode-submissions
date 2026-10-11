class Solution {
    public int climbStairs(int n) {
        if (n ==1 || n ==2) return n;

        int prevTwo = 1;
        int prevOne = 2;

        for(int i = 3; i<= n; i++)
        {
            int current = prevOne+prevTwo;
            prevTwo = prevOne;
            prevOne = current;
        }

        return prevOne;
        
    }
}
