class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var min = prices[0]
        prices.forEach { p ->
            if (min >= p) min = p
            else { 
                maxProfit += p - min
                min = p
            }
        }
        return maxProfit
    }
}
