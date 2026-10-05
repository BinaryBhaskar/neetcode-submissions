class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val prefixSums = hashMapOf<Int, Int>()
        prefixSums[0] = 1
        var currentSum = 0
        var count = 0
        
        for (num in nums) {
            currentSum += num
            if (prefixSums.containsKey(currentSum - k)) {
                count += prefixSums[currentSum - k]!!
            }
            prefixSums[currentSum] = prefixSums.getOrDefault(currentSum, 0) + 1
        }
        return count
    }
}
