class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val couldGet = HashMap<Int,Int>() // no. and count
        couldGet[0] = 1
        var count = 0
        var currSum = 0

        for (num in nums) {
            currSum += num
            if (couldGet.containsKey(currSum - k)) {
                count += couldGet[currSum - k]!!
            }
            couldGet[currSum] = couldGet.getOrDefault(currSum, 0) + 1
        }
        return count
    }
}