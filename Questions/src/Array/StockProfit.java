package Array;

// To find the Minimum: Start at the highest possible ceiling (MAX_VALUE) so you can move down.

// Why use Integer.MAX_VALUE?
// Initializing minPrice to Integer.MAX_VALUE is a programming best practice.
// It ensures that whatever the first price in your array is, it will be smaller than the initial minPrice, effectively "starting" the tracker with the first day's price.

public class StockProfit {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}

