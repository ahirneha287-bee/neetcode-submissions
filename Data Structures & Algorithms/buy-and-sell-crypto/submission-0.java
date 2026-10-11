class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minSoFar = Integer.MAX_VALUE;

        for(int price: prices)
        {
            if(price < minSoFar)
            {
                minSoFar= price;
            }
            maxProfit= Math.max(maxProfit,price - minSoFar);
        }
        return maxProfit;
    }
}