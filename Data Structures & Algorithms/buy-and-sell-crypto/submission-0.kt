class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var min = prices[0]
        var max = prices[0]
        prices.forEachIndexed { i, p ->
            if (p < min) min = p.also { max = p }
            if (p > max) max = p
            maxProfit = maxOf(maxProfit, max - min)
        }
        return maxProfit
    }
}
